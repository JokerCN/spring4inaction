package tech.tongyu.yyw.chapter3.qualifier.impl;

import tech.tongyu.yyw.chapter3.qualifier.intel.Dessert;

public class Cake implements Dessert {

    @Override
    public void eated() {
        System.err.println("Eating Cake.");
    }
}
