package tech.tongyu.yyw.chapter1;

import org.junit.Test;
import org.mockito.Mockito;
import tech.tongyu.yyw.chapter1.impl.BraveKnight;
import tech.tongyu.yyw.chapter1.intel.Quest;

/**
 * Created by super on 2017/7/22.
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = Mockito.mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }
}
