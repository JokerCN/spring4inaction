package tech.tongyu.yyw.chapter3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.tongyu.yyw.chapter3.placeholder.AppName;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/chapter3/datasource.xml")
public class AppNameTest {

    @Autowired
    private AppName appName;

    @Test
    public void testAppName(){
        System.err.println(appName.getAppName());
    }
}
