package tech.tongyu.yyw.chapter1.impl;

import tech.tongyu.yyw.chapter1.intel.Quest;

import java.io.PrintStream;

/**
 * Created by super on 2017/7/22.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
