package com.apps.idhamrahadian.giveawaytrash.view.gallery;

/*
Developed by IdhdamRahadian, 10116476, AKB-11
on Sunday, May 2 2019
*/

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.idhamrahadian.giveawaytrash.R;
import com.apps.idhamrahadian.giveawaytrash.adapter.GalleryAdapter;
import com.apps.idhamrahadian.giveawaytrash.model.GalleryModel;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

//    ArrayList personNames = new ArrayList<>(Arrays.asList("gambar","gambar","gambar","gambar","gambar","gambar","gambar"));
//    ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.prayer,R.drawable.prayer,R.drawable.prayer,R.drawable.prayer,R.drawable.prayer,R.drawable.prayer,R.drawable.prayer));
    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myFragmentView = inflater.inflate(R.layout.fragment_gallery, container, false);
        ArrayList<GalleryModel> galleryModels = new ArrayList<>();
        galleryModels.add(new GalleryModel(R.drawable.saya01));
        galleryModels.add(new GalleryModel(R.drawable.saya02));
        galleryModels.add(new GalleryModel(R.drawable.saya03));
        galleryModels.add(new GalleryModel(R.drawable.saya04));
        galleryModels.add(new GalleryModel(R.drawable.saya05));
        galleryModels.add(new GalleryModel(R.drawable.saya06));
        galleryModels.add(new GalleryModel(R.drawable.saya07));
        galleryModels.add(new GalleryModel(R.drawable.saya08));
        galleryModels.add(new GalleryModel(R.drawable.saya09));
        galleryModels.add(new GalleryModel(R.drawable.saya10));
        galleryModels.add(new GalleryModel(R.drawable.saya11));
        galleryModels.add(new GalleryModel(R.drawable.saya12));

        mRecycleView = myFragmentView.findViewById(R.id.recyclerViewGrid);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(getActivity(),3);
        mAdapter = new GalleryAdapter(galleryModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
//        RecyclerView recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recyclerViewGrid);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
//        recyclerView.setLayoutManager(gridLayoutManager);
//
//        GalleryAdapter galleryAdapter = new GalleryAdapter(getActivity(),personNames,personImages);
//        recyclerView.setAdapter(galleryAdapter);
        return myFragmentView;
    }
}
