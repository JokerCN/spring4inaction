package tech.tongyu.yyw.chapter2.impl;

import org.springframework.stereotype.Component;
import tech.tongyu.yyw.chapter2.intel.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
