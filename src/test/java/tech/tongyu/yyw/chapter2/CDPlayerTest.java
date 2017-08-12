package tech.tongyu.yyw.chapter2;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tech.tongyu.yyw.chapter2.intel.CompactDisc;
import tech.tongyu.yyw.chapter2.intel.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
        /*Assert.assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +
                " by The Beatles\r\n",
                systemOutRule.getLog());*/
    }
}
