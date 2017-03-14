package digua.dagger2lean.test5.ioc;

import javax.inject.Singleton;

import dagger.Component;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.app.ioc.component.AppComponent;
import digua.dagger2lean.app.ioc.module.AppModule;
import digua.dagger2lean.app.ioc.scope.AppSocpe;
import digua.dagger2lean.app.ioc.scope.UserScope;
import digua.dagger2lean.test4.ui.Test4_Fragment;
import digua.dagger2lean.test5.ui.Activity0;

/**
 * @author digua
 *         <p>
 *         on 2017/3/13.(^ ^)
 */
@AppSocpe
@Component(dependencies = AppComponent.class,modules = Activity0Module.class)
public interface Activity0Component {
    void inject(Activity0 activity);
}