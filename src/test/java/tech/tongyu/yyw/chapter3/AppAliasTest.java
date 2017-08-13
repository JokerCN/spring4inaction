package tech.tongyu.yyw.chapter3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tech.tongyu.yyw.chapter3.placeholder.AppAlias;
import tech.tongyu.yyw.chapter3.placeholder.AppConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppAliasTest {

    @Autowired
    private AppAlias appAlias;

    @Test
    public void testAppAlias(){
        System.err.println(appAlias.getAppAlias());
    }
}
