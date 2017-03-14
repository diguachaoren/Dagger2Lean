package digua.dagger2lean.test1.bean;

import javax.inject.Inject;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */

public class A2 {
    private String name = "A2";

    @Inject
    public A2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
