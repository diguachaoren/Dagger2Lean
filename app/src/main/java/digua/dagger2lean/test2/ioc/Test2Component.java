package digua.dagger2lean.test2.ioc;

import junit.framework.Test;

import dagger.Component;
import digua.dagger2lean.test2.bean.B1;
import digua.dagger2lean.test2.bean.B2;
import digua.dagger2lean.test2.ui.Test2_Fragment;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */
@Component(modules = Test2Module.class)
public interface Test2Component {
    B1 provideB1();
    B2 provideB2();
    void inject(Test2_Fragment fragment);
}
