package com.webapp.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("spring.profiles.active", "dev");

		AnnotationConfigWebApplicationContext rootContext = new  AnnotationConfigWebApplicationContext();
		rootContext.register(RootConfig.class);
		ContextLoaderListener contextListerer = new ContextLoaderListener(rootContext);
		servletContext.addListener(contextListerer);
		
		AnnotationConfigWebApplicationContext webContext = new  AnnotationConfigWebApplicationContext();
		webContext.register(WebConfig.class);
		webContext.setServletContext(servletContext);
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webContext);
		Dynamic servlet = servletContext.addServlet("dispatcher", dispatcherServlet);
		
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/api/*");
		
		
	}

}
