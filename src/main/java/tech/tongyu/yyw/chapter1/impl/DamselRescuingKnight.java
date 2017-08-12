package tech.tongyu.yyw.chapter1.impl;

import tech.tongyu.yyw.chapter1.intel.Knight;
import tech.tongyu.yyw.chapter1.intel.Quest;

/**
 * Created by super on 2017/7/22.
 */
public class DamselRescuingKnight implements Knight {

    private Quest quest;

    public DamselRescuingKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
