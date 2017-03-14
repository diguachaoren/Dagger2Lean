package digua.dagger2lean.test3.ioc;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Go3Qualifier {
    String value() default "";
}

