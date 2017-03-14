package digua.dagger2lean.test2.ioc;

import dagger.Module;
import dagger.Provides;
import digua.dagger2lean.test2.bean.B1;
import digua.dagger2lean.test2.bean.B2;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */
@Module
public class Test2Module {


    @Provides
    B1 provideB1(String name) {
        return new B1(name);
    }

    @Provides
    B2 provideB2(int age) {
        return new B2(age);
    }

    @Provides
    String provideName() {
        return "Name";
    }


    @Provides
    int provideAge() {
        return 21;
    }


}
