package tech.tongyu.yyw.chapter1.impl;

import java.io.PrintStream;

/**
 * Created by super on 2017/7/23.
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight " +
                "did embark on a quest!");
    }
}
