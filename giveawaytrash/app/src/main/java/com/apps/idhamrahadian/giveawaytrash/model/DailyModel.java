package com.apps.idhamrahadian.giveawaytrash.model;

/*
Developed by IdhdamRahadian, 10116476, AKB-11
on Sunday, May 2 2019
*/

public class DailyModel {
    private int mImageResource;
    private String namaGambar;

    public DailyModel(int ImageResource, String namagambar){
        mImageResource = ImageResource;
        namaGambar = namagambar;

    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getNamaGambar(){
        return namaGambar;
    }

}
