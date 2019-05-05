package com.apps.idhamrahadian.giveawaytrash.model;

/*
Developed by IdhdamRahadian, 10116476, AKB-11
on Sunday, May 2 2019
*/

public class MusicModel {
    private int musicResource;
    private String namaMusic;

    public MusicModel(int musicResource, String namaMusic) {
        this.musicResource = musicResource;
        this.namaMusic = namaMusic;
    }

    public int getMusicResource() {
        return musicResource;
    }

    public void setMusicResource(int musicResource) {
        this.musicResource = musicResource;
    }

    public String getNamaMusic() {
        return namaMusic;
    }

    public void setNamaMusic(String namaMusic) {
        this.namaMusic = namaMusic;
    }
}
