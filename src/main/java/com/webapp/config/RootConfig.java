package com.webapp.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {"com.webapp.core"})
@PropertySource("classpath:app.properties")
@EnableJpaRepositories(basePackages = "com.webapp.core.repository")
@EnableTransactionManagement
public class RootConfig {
	
	@Value("${datasource.jdbc.driverClassName}")
	private String driverClassName;
	
	@Value("${datasource.jdbc.url}")
	private String url;
	
	@Value("${datasource.jdbc.username}")
	private String username;
	
	@Value("${datasource.jdbc.password}")
	private String password;
	
	@Value("${datasource.database-platform}")
	private String databasePlatform;
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter 
			) {
		LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
		emfb.setDataSource(dataSource);
		emfb.setJpaVendorAdapter(jpaVendorAdapter);
		emfb.setPackagesToScan("com.webapp.core.domain");
		return emfb;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(false);
		adapter.setDatabasePlatform(databasePlatform);
		return adapter;
	}

	@Profile("dev")
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setInitialSize(5);
		return ds;
	}
	
	@Bean
	   public static PropertySourcesPlaceholderConfigurer
	     propertySourcesPlaceholderConfigurer() {
	      return new PropertySourcesPlaceholderConfigurer();
	   }
	
	@Bean
	  public PlatformTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean  entityManagerFactoryBean) {
	    JpaTransactionManager txManager = new JpaTransactionManager();
	    txManager.setEntityManagerFactory(entityManagerFactoryBean.getObject());
	    return txManager;
	  }	
}
