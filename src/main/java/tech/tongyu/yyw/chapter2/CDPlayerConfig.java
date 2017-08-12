package tech.tongyu.yyw.chapter2;

import org.springframework.context.annotation.*;
import tech.tongyu.yyw.chapter2.impl.CDPlayer;
import tech.tongyu.yyw.chapter2.impl.SgtPeppers;
import tech.tongyu.yyw.chapter2.intel.CompactDisc;

/**
 * Created by super on 2017/7/23.
 */
@Configuration
//@Import(CDConfig.class)
//@ComponentScan
@ImportResource("classpath:META-INF/spring/chapter2/cd-config.xml")
public class CDPlayerConfig {

    //告知Spring该方法将会返回一个对象，该对象要注册为Spring应用上下文中的bean
    //默认情况下，bean的ID与@Bean所注解的方法名一致，此处为sgtPeppers
    /*@Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }*/

    /*@Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }*/

    /*
    在Config中装配bean的最简单方式就是引用创建bean的方法
    由于sgtPeppers方法上添加了@Bean注解，Spring将会拦截所有对它
    的调用，并确保直接返回该方法所创建的bean，而不是每次都对其进行
    实际的调用。
     */
    /*@Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }*/

    /*
    另一种更容易理解的方式
     */
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}
