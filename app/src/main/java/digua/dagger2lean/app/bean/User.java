package digua.dagger2lean.app.bean;

import javax.inject.Inject;

/**
 * @author digua
 *         <p>
 *         on 2017/3/5.(^ ^)
 */

public class User {

    private String name = "app user";
    private int age = 100;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
