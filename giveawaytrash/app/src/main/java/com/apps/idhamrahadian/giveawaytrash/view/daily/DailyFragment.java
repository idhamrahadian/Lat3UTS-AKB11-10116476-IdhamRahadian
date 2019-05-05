package com.apps.idhamrahadian.giveawaytrash.view.daily;

/*
Developed by IdhdamRahadian, 10116476, AKB-11
on Sunday, May 2 2019
*/

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.apps.idhamrahadian.giveawaytrash.R;
import com.apps.idhamrahadian.giveawaytrash.adapter.DailyAdapter;
import com.apps.idhamrahadian.giveawaytrash.adapter.FriendAdapter;
import com.apps.idhamrahadian.giveawaytrash.model.DailyModel;
import com.apps.idhamrahadian.giveawaytrash.model.FriendsModel;

import java.util.ArrayList;

public class DailyFragment extends Fragment {

    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private RecyclerView mRecycleView2;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View myFragmentView = inflater.inflate(R.layout.fragment_daily, container, false);

        ArrayList<DailyModel> dailyModels = new ArrayList<>();
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 04:00 Wakeup"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 05:00 - 06:15 Running"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 06:15 - 06:30 Shower"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 06:30 - 07:00 Breakfast"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 07:00 - 11:45 Studying"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 11:45 - 12:30 Lunch"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 12:30 - 17:00 Work"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 17:00 - 17:30 Shower"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 17:30 - 19:00 Relaxing"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 19:00 - 19:30 Dinner"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 19:30 - 22:00 Family Time"));
        dailyModels.add(new DailyModel(R.drawable.ic_todo," 22.00 Sleep"));


        mRecycleView = myFragmentView.findViewById(R.id.daily_id_r);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new DailyAdapter(dailyModels);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);

        ArrayList<FriendsModel> friendsModels = new ArrayList<>();
        friendsModels.add(new FriendsModel(R.drawable.teman01,"Gerdi A Salam"));
        friendsModels.add(new FriendsModel(R.drawable.teman02,"Selly Huldan"));
        friendsModels.add(new FriendsModel(R.drawable.teman03,"Reza A Fauzi"));
        friendsModels.add(new FriendsModel(R.drawable.teman04,"Faldi Favian"));

        mRecycleView2 = myFragmentView.findViewById(R.id.daily_id_r_h);
        mRecycleView2.setHasFixedSize(true);
        mLayoutManager2 = new LinearLayoutManager(getActivity());
        mAdapter2 = new FriendAdapter(friendsModels);

        mRecycleView2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayout.HORIZONTAL,false));
        mRecycleView2.setAdapter(mAdapter2);

        return myFragmentView;


    }
}
