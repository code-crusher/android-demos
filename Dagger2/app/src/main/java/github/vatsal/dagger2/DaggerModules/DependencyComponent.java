package github.vatsal.dagger2.DaggerModules;

import javax.inject.Singleton;

import dagger.Component;
import github.vatsal.dagger2.MainActivity;

/**
 * Created by
 * --Vatsal Bajpai on
 * --19/07/16 at
 * --9:36 PM in
 */

@Singleton
@Component(modules = {ConstantHelperModule.class})

public interface DependencyComponent {

    void inject(MainActivity activity);
}
