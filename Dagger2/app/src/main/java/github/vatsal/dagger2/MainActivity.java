package github.vatsal.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public String TAG_DAGGER = "dagger";

    @Inject
    ConstantsHelper constantsHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //injecting the class
        ((MainApplication) getApplication()).getComponent().inject(this);

        checkNull(constantsHelper);
    }

    public void checkNull(Object object) {
        boolean injected = object == null ? false : true;
        Log.d(TAG_DAGGER, "" + injected);
    }
}
