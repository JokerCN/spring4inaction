package tech.tongyu.yyw.chapter3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tech.tongyu.yyw.chapter3.spel.SpringExpressionLangConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringExpressionLangConfig.class)
public class SpringExpressionLangConfigTest {

    @Autowired
    private SpringExpressionLangConfig springExpressionLangConfig;

    @Test
    public void spelTest(){
        System.out.println(springExpressionLangConfig.getArtist());
        System.out.println(springExpressionLangConfig.getPi());
        System.out.println(springExpressionLangConfig.getRandom());
        System.out.println(springExpressionLangConfig.getLength());
        System.out.println(springExpressionLangConfig.getAnswer());
        System.out.println(springExpressionLangConfig.isTrueEnd());
    }
}
