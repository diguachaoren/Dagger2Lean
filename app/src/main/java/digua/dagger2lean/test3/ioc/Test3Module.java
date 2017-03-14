package digua.dagger2lean.test3.ioc;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;
import digua.dagger2lean.test2.bean.B1;
import digua.dagger2lean.test3.bean.C1;
import digua.dagger2lean.test3.bean.Go3;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */
@Module
public class Test3Module {


    @Test3Qualifier("jack")
    @Provides
    C1 provideJack() {
        return new C1("【jack】");
    }


    @Test3Qualifier("tom")
    @Provides
    C1 provideTom() {
        return new C1("【tom】", 20);
    }


    @Test3Qualifier("jerry")
    @Provides
    C1 provideJerry() {
        return new C1("【jerry】", 23, 1000);
    }


}
