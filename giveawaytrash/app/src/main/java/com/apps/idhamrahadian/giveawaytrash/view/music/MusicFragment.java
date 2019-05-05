package com.apps.idhamrahadian.giveawaytrash.view.music;

/*
Developed by IdhdamRahadian, 10116476, AKB-11
on Sunday, May 2 2019
*/

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.idhamrahadian.giveawaytrash.R;

public class MusicFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_music, null);
    }
}
