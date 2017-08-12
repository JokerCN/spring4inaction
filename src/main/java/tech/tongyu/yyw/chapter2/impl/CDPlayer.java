package tech.tongyu.yyw.chapter2.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.tongyu.yyw.chapter2.intel.CompactDisc;
import tech.tongyu.yyw.chapter2.intel.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    /*
    当@Autowired修饰某个方法时，它会尝试满足方法参数上所声明的依赖
    可以将该注解的required属性设置为false，则当未找到匹配的bean时，
    参数会处于未装配的状态。
     */
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
