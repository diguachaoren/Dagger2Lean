package digua.dagger2lean.test2.bean;

import javax.inject.Inject;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */

public class B1 {


    String name;

    @Inject
    public B1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
