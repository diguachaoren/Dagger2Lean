package digua.dagger2lean.test1.ioc;

import dagger.Component;
import digua.dagger2lean.MainActivity;
import digua.dagger2lean.test1.bean.A1;
import digua.dagger2lean.test1.bean.A2;
import digua.dagger2lean.test1.ui.Test1_Fragment;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */
@Component
public interface Test1Component {
    A1 a1();
    A2 a2();

    void inject(Test1_Fragment mTest1_Fragment);
}
