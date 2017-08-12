package tech.tongyu.yyw.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@Configuration
public class Chapter3MainConfig {

    @Bean()
    @Profile("dev")
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:META-INF/spring/chapter3/sqls/schema.sql")
                .addScript("classpath:META-INF/spring/chapter3/sqls/test-data.sql")
                .build();
    }

}
