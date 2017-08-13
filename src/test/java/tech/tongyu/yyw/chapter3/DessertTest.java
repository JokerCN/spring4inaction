package tech.tongyu.yyw.chapter3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.tongyu.yyw.chapter3.qualifier.DessertConfig;
import tech.tongyu.yyw.chapter3.qualifier.intel.Eater;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {

    @Autowired
    private Eater eater;

    @Test
    public void testEater(){
        eater.eat();
    }
}
