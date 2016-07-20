package github.vatsal.dagger2.DaggerModules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import github.vatsal.dagger2.ConstantsHelper;

/**
 * Created by
 * --Vatsal Bajpai on
 * --20/07/16 at
 * --9:30 AM in
 */

@Module
public class ConstantHelperModule {

    @Provides
    @Singleton
    public ConstantsHelper getConstantHelper() {
        return new ConstantsHelper();
    }

}
