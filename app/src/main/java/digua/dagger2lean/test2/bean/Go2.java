package digua.dagger2lean.test2.bean;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */

public class Go2 {

    B1 b1;
    B2 b2;

    @Inject
    public Go2(B1 b1, B2 b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    public void print(){
        Log.i("Go2","Go2=>"+b1.getName()+" "+b2.getAge());
    }
}
