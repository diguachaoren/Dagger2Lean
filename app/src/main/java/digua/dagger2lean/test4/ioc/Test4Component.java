package digua.dagger2lean.test4.ioc;

import javax.inject.Singleton;

import dagger.Component;
import digua.dagger2lean.app.ioc.component.AppComponent;
import digua.dagger2lean.app.ioc.scope.AppSocpe;
import digua.dagger2lean.app.ioc.scope.UserScope;
import digua.dagger2lean.test4.ui.Test4_Fragment;

/**
 * @author digua
 *         <p>
 *         on 2017/3/6.(^ ^)
 */
@AppSocpe
@Component(dependencies = AppComponent.class)
public interface Test4Component {
    void inject(Test4_Fragment fragment);
}
