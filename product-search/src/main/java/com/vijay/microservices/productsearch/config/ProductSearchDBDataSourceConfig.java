package com.vijay.microservices.productsearch.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "com.vijay.microservices.productsearch.db.repository")
public class ProductSearchDBDataSourceConfig {

	// https://www.mkyong.com/spring/spring-embedded-database-examples/
	@Bean(name = "productdatasource")
	public DataSource dataSource() {

		// no need shutdown, EmbeddedDatabaseFactoryBean will take care of this
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2) // .H2 or .DERBY
				.addScript("product-search-sql/schema.sql").addScript("product-search-sql/data.sql").build();
		return db;
	}

	// https://www.baeldung.com/the-persistence-layer-with-spring-and-jpa
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Qualifier("productdatasource") DataSource ds) {

		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(ds);
		em.setPackagesToScan(new String[] { "com.vijay.microservices.productsearch.pojo" });

		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);

		return em;
	}
}
