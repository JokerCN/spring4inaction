package tech.tongyu.yyw.chapter3.placeholder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySources;

import java.util.Iterator;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
@PropertySource("classpath:META-INF/spring/chapter3/app.properties")
public class AppConfig {

}
