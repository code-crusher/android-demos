package github.vatsal.eventbusdemo.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

import github.vatsal.eventbusdemo.R;
import github.vatsal.eventbusdemo.models.AdapterEvent;

/**
 * Created by
 * --Vatsal Bajpai on
 * --05/08/16 at
 * --4:10 PM
 */
public class AddActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    public void addNewItem(View view) {
        EventBus.getDefault().post(new AdapterEvent("New item"));
    }
}
