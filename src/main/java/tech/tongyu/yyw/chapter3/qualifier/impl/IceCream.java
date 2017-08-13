package tech.tongyu.yyw.chapter3.qualifier.impl;

import org.springframework.stereotype.Component;
import tech.tongyu.yyw.chapter3.qualifier.annotation.Cold;
import tech.tongyu.yyw.chapter3.qualifier.annotation.Creamy;
import tech.tongyu.yyw.chapter3.qualifier.intel.Dessert;

@Component
@Cold
@Creamy
public class IceCream implements Dessert {

    @Override
    public void eated() {
        System.err.println("Eating IceCream.");
    }
}
