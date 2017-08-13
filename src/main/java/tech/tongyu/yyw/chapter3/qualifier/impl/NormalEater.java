package tech.tongyu.yyw.chapter3.qualifier.impl;

import tech.tongyu.yyw.chapter3.qualifier.intel.Dessert;
import tech.tongyu.yyw.chapter3.qualifier.intel.Eater;

public class NormalEater implements Eater{

    private Dessert dessert;

    public NormalEater(Dessert dessert){
        this.dessert = dessert;
    }

    @Override
    public void eat() {
        dessert.eated();
    }
}
