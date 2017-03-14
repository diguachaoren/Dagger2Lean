package digua.dagger2lean.test1.bean;

import javax.inject.Inject;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */

public class A1 {

    private String name = "A1";

    @Inject
    public A1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
