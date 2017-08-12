package tech.tongyu.yyw.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.tongyu.yyw.chapter2.impl.CDPlayer;

/**
 * Created by super on 2017/7/23.
 */
public class CDPlayerXmlConfig {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/chapter2/cdplayer.xml");
        context.getBean("cdPlayer", CDPlayer.class).play();
        context.close();
    }
}
