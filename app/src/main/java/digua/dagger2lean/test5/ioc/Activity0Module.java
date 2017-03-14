package digua.dagger2lean.test5.ioc;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import digua.dagger2lean.app.bean.User;

/**
 * @author digua
 *         <p>
 *         on 2017/3/14.(^ ^)
 */
@Module
public class Activity0Module {

    @Provides
    User providesUser() {
        return new User("000-user",30);
    }
}
