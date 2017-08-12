package tech.tongyu.yyw.chapter1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.tongyu.yyw.chapter1.impl.BraveKnight;
import tech.tongyu.yyw.chapter1.impl.SlayDragonQuest;
import tech.tongyu.yyw.chapter1.intel.Knight;
import tech.tongyu.yyw.chapter1.intel.Quest;

import javax.management.MXBean;

/**
 * Created by super on 2017/7/22.
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
