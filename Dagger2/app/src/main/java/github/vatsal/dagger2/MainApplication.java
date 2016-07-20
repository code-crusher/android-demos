package github.vatsal.dagger2;

import android.app.Application;

import github.vatsal.dagger2.DaggerModules.DaggerDependencyComponent;
import github.vatsal.dagger2.DaggerModules.DependencyComponent;

/**
 * Created by
 * --Vatsal Bajpai on
 * --19/07/16 at
 * --9:40 PM in
 */
public class MainApplication extends Application {

    DependencyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDependencyComponent.builder().build();
    }

    public DependencyComponent getComponent() {
        return component;
    }
}
