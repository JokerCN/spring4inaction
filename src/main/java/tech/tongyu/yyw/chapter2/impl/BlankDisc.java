package tech.tongyu.yyw.chapter2.impl;

import tech.tongyu.yyw.chapter2.intel.CompactDisc;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;
    private int number;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks){
            System.out.println("-Track: " + track);
        }
        System.out.println(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
