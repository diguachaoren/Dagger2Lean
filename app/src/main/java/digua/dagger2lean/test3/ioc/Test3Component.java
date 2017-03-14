package digua.dagger2lean.test3.ioc;

import javax.inject.Named;

import dagger.Component;
import digua.dagger2lean.test3.bean.C1;
import digua.dagger2lean.test3.bean.Go3;
import digua.dagger2lean.test3.ui.Test3_Fragment;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */
@Component(dependencies = Test3Module.class)
public interface Test3Component {

    @Test3Qualifier("jack")
    C1 provideJack();

    @Test3Qualifier("tom")
    C1 provideTom();

    @Test3Qualifier("jerry")
    C1 provideJerry();

    void inject(Test3_Fragment fragment);


}
