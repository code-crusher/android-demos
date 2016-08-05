package github.vatsal.eventbusdemo.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import github.vatsal.eventbusdemo.R;

public class FeedViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;

    public FeedViewHolder(View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.tv_name);
    }
}