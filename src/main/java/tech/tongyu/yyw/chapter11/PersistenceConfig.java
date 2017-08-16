package tech.tongyu.yyw.chapter11;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
@PropertySource("classpath:META-INF/spring/chapter11/datasource.properties")
@EnableJpaRepositories(basePackageClasses = PersistenceConfig.class)
public class PersistenceConfig {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(dataSource);
		bean.setJpaVendorAdapter(jpaVendorAdapter);
		bean.setPackagesToScan("tech.tongyu.yyw.chapter11.domain");
		return bean;
	}

	@Bean
	public DataSource dataSource(
			@Value("${datasource.jdbc.url}") String url,
			@Value("${datasource.jdbc.username}") String username,
			@Value("${datasource.jdbc.password}") String password,
			@Value("${datasource.jdbc.initialSize}") Integer initialSize,
			@Value("${datasource.jdbc.maxActive}") Integer maxActive,
			@Value("${datasource.jdbc.maxWait}") Integer maxWait,
			@Value("${datasource.jdbc.timeBetweenEvictionRunsMillis}") Integer timeBetweenEvictionRunsMillis,
			@Value("${datasource.jdbc.minEvictableIdleTimeMillis}") Integer minEvictableIdleTimeMillis,
			@Value("${datasource.jdbc.validationQuery}") String validationQuery,
			@Value("${datasource.jdbc.testWhileIdle}") Boolean testWhileIdle,
			@Value("${datasource.jdbc.testOnBorrow}") Boolean testOnBorrow,
			@Value("${datasource.jdbc.testOnReturn}") Boolean testOnReturn,
			@Value("${datasource.jdbc.poolPreparedStatements}") Boolean poolPreparedStatements,
			@Value("${datasource.jdbc.maxPoolPreparedStatementPerConnectionSize}") Integer maxPoolPreparedStatementPerConnectionSize,
			@Value("${datasource.jdbc.filters}") String filters
	) throws IOException{
		DruidDataSource dataSource =  new DruidDataSource();
		Properties properties = new Properties();
		Resource resource = new ClassPathResource("META-INF/spring/chapter11/datasource.properties");
		properties.load(resource.getInputStream());
		dataSource.setConnectProperties(properties);
		return dataSource;
	}


	@Bean
	public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.POSTGRESQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQL94Dialect");
		return adapter;
	}

	@Bean // 用于注入@PersistentContext 或 @PersistentUnit
	public PersistenceAnnotationBeanPostProcessor persistenceAnnotationBeanPostProcessor(){
		return new PersistenceAnnotationBeanPostProcessor();
	}

	@Bean
	public BeanPostProcessor persistenceTranslation(){
		return new PersistenceExceptionTranslationPostProcessor();
	}

}