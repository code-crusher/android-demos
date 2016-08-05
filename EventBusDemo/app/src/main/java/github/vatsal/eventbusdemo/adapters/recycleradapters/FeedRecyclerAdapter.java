package github.vatsal.eventbusdemo.adapters.recycleradapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import github.vatsal.eventbusdemo.R;
import github.vatsal.eventbusdemo.adapters.viewholders.FeedViewHolder;

/**
 * Created by
 * --Vatsal Bajpai
 */

public class FeedRecyclerAdapter extends RecyclerView.Adapter<FeedViewHolder> {

    private Context currContext;
    private ArrayList<String> itemList;

    public FeedRecyclerAdapter(Context curr_context, ArrayList<String> itemList) {
        this.itemList = itemList;
        this.currContext = curr_context;
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.feed_list_item, null);
        return new FeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, int position) {
        handleItemEvents(holder, position);
    }

    private void handleItemEvents(final FeedViewHolder feedViewHolder, final int position) {
        final String model = itemList.get(position);
        if (model != null) {
            try {
                feedViewHolder.tvName.setText("Item" + position);
                feedViewHolder.tvName.setTag(feedViewHolder);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}

