package digua.dagger2lean.test3.bean;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Qualifier;

import digua.dagger2lean.test3.ioc.Go3Qualifier;
import digua.dagger2lean.test3.ioc.Test3Qualifier;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */

public class Go3 {

    C1 cc1;

    C1 cc2;

    C1 cc3;

    @Inject
    public Go3(@Test3Qualifier("jerry")C1 cc1,
               @Test3Qualifier("tom")C1 cc2,
               @Test3Qualifier("jack")C1 cc3) {
        this.cc1 = cc1;
        this.cc2 = cc2;
        this.cc3 = cc3;
    }



    public C1 getCc1() {
        return cc1;
    }

    public void setCc1(C1 cc1) {
        this.cc1 = cc1;
    }

    public C1 getCc2() {
        return cc2;
    }

    public void setCc2(C1 cc2) {
        this.cc2 = cc2;
    }

    public C1 getCc3() {
        return cc3;
    }

    public void setCc3(C1 cc3) {
        this.cc3 = cc3;
    }


    public void print() {
        Log.i("Go3", "name:" + cc1.getName()
                + " name:" + cc2.getName()
                + " name:" + cc3.getName());
    }
}
