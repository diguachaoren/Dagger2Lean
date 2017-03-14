package digua.dagger2lean.app.bean;

/**
 * @author digua
 *         <p>
 *         on 2017/3/14.(^ ^)
 */

public class People {
    private String name = "app user";
    private int age = 100;

    public People(String name, int age) {
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
