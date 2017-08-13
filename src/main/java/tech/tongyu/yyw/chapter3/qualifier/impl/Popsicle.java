package tech.tongyu.yyw.chapter3.qualifier.impl;

import tech.tongyu.yyw.chapter3.qualifier.intel.Dessert;

public class Popsicle implements Dessert {

    @Override
    public void eated() {
        System.err.println("Eating Popsicle.");
    }
}
