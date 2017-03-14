package digua.dagger2lean.app;

import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

import digua.dagger2lean.app.bean.People;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.app.ioc.component.AppComponent;
import digua.dagger2lean.app.ioc.component.DaggerAppComponent;
import digua.dagger2lean.app.ioc.component.UserComponent;
import digua.dagger2lean.app.ioc.module.AppModule;

/**
 * @author digua
 *         <p>
 *         on 2017/3/5.(^ ^)
 */

public class MainApplication extends Application {

    @Inject
    People user1;

    @Inject
    People user2;

    // 全局单利类 只对单一component生效
    public AppComponent component;

    // 全局单利类 只对单一component生效
    public UserComponent userComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        userComponent = component.plus();
        component.inject(this);

        Log.i("user", "user1=>" + user1.toString() + " " + user1.getName());
        Log.i("user", "user2=>" + user2.toString() + " " + user2.getName());
    }


    public AppComponent getComponent() {
        return component;
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }

}
