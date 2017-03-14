package digua.dagger2lean.test3.bean;

import javax.inject.Inject;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 *         <p>
 *         <p>
 *         模拟生成3个对象
 *         1、jack
 *         2、tom age
 *         3、jerry age money
 */

public class C1 {

    private String name;

    private int age;

    private long money;

    /**
     * 构造1
     */
    public C1(String name) {
        this.name = name;
    }

    /**
     * 构造2
     */
    public C1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 构造3
     */
    public C1(String name, int age, long money) {
        this.name = name;
        this.age = age;
        this.money = money;
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

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
