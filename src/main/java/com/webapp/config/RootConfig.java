package com.webapp.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@EnableJpaRepositories(basePackages="com.habuma.spittr.db")
public class RootConfig {
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
		DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
		LocalContainerEntityManagerFactoryBean emfb =
		new LocalContainerEntityManagerFactoryBean();
		emfb.setDataSource(dataSource);
		emfb.setJpaVendorAdapter(jpaVendorAdapter);
		emfb.setPackagesToScan("com.webapp.domain");
	return emfb;
	}
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
	HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
	adapter.setDatabase(Database.MYSQL);
	adapter.setShowSql(true);
	adapter.setGenerateDdl(false);
	adapter.setDatabasePlatform("org.hibernate.dialect.HSQLDialect");
	return adapter;
	}
}
