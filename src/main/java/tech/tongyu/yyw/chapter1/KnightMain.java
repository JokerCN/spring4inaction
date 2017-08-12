package tech.tongyu.yyw.chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.tongyu.yyw.chapter1.intel.Knight;

/**
 * Created by super on 2017/7/22.
 */
public class KnightMain {
    public static void main(String[] args) throws Exception {
//        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/chapter1/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
