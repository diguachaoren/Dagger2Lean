package digua.dagger2lean.app.ioc.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.app.ioc.scope.UserScope;

/**
 * @author digua
 *         <p>
 *         on 2017/3/9.(^ ^)
 */
@Module
public class UserModule {

    @UserScope
    @Provides
    User ProvideUser() {
        return new User("***-user", 24);
    }


}
