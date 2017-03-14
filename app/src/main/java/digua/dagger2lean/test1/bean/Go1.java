package digua.dagger2lean.test1.bean;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author digua
 *         <p>
 *         on 2017/3/4.(^ ^)
 */

public class Go1 {

    private A1 mA1;
    private A2 mA2;


    @Inject
    public Go1(A1 a1,A2 a2) {
        mA1 = a1;
        mA2 = a2;
    }

    public void print(){
        Log.i("G1",mA1.getName()+"---"+mA2.getName());
    }


}
