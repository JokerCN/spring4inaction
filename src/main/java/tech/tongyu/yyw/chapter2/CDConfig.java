package tech.tongyu.yyw.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.tongyu.yyw.chapter2.impl.SgtPeppers;
import tech.tongyu.yyw.chapter2.intel.CompactDisc;

@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }

}
