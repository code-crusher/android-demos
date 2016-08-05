package github.vatsal.eventbusdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;

import github.vatsal.eventbusdemo.activities.AddActivity;
import github.vatsal.eventbusdemo.adapters.recycleradapters.FeedRecyclerAdapter;
import github.vatsal.eventbusdemo.models.AdapterEvent;

public class MainActivity extends AppCompatActivity {

    FeedRecyclerAdapter recyclerAdapter;
    ImageButton butAdd;
    RecyclerView rvFeed;

    ArrayList<String> itemList = new ArrayList<>();

    @Subscribe
    public void OnAdapterEvent(AdapterEvent event) {
        itemList.add(event.name);
        recyclerAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        rvFeed = (RecyclerView) findViewById(R.id.rv_feed);
        butAdd = (ImageButton) findViewById(R.id.but_add);

        populateView();
    }

    private void populateView() {
        itemList.add("Press + to add more");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvFeed.setLayoutManager(linearLayoutManager);
        rvFeed.setHasFixedSize(true);
        recyclerAdapter = new FeedRecyclerAdapter(this, itemList);
        rvFeed.setAdapter(recyclerAdapter);
    }

    public void addItem(View view) {
        startActivity(new Intent(this, AddActivity.class));
    }

    @Override
    public void onStart() {
        super.onStart();
        if (!EventBus.getDefault().isRegistered(this))
            EventBus.getDefault().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
