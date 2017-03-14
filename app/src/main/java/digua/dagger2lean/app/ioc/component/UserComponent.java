package digua.dagger2lean.app.ioc.component;

import javax.inject.Singleton;

import dagger.Subcomponent;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.app.ioc.module.AppModule;
import digua.dagger2lean.app.ioc.module.UserModule;
import digua.dagger2lean.app.ioc.scope.UserScope;
import digua.dagger2lean.test5.ui.Activity1;
import digua.dagger2lean.test5.ui.Activity2;

/**
 * @author digua
 *         <p>
 *         on 2017/3/9.(^ ^)
 */
@UserScope
@Subcomponent(modules = UserModule.class)
public interface UserComponent {
        void inject(Activity1 activity1);
        void inject(Activity2 activity2);
}
