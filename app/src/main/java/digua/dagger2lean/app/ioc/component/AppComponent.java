package digua.dagger2lean.app.ioc.component;

import javax.inject.Singleton;

import dagger.Component;
import digua.dagger2lean.app.MainApplication;
import digua.dagger2lean.app.bean.People;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.app.ioc.module.AppModule;
import digua.dagger2lean.app.ioc.module.UserModule;
import digua.dagger2lean.app.ioc.scope.AppSocpe;

/**
 * @author digua
 *         <p>
 *         on 2017/3/5.(^ ^)
 *
 *         root
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    People providePeople();// 全局提供单例对象
    void inject(MainApplication application);
    UserComponent plus();
}
