package digua.dagger2lean.app.ioc.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import digua.dagger2lean.app.bean.People;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.app.ioc.scope.AppSocpe;
import digua.dagger2lean.app.ioc.scope.UserScope;

/**
 * @author digua
 *         <p>
 *         on 2017/3/5.(^ ^)
 */
@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }
    @Provides
    @Singleton
    Application providesApplication() {
        return application;
    }

    @Singleton
    @Provides
    People ProvideUser() {
        return new People("People", 24);
    }
}
