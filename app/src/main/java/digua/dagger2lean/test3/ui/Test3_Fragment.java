package digua.dagger2lean.test3.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.OnClick;
import digua.dagger2lean.BaseFragment;
import digua.dagger2lean.R;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.test2.bean.B1;
import digua.dagger2lean.test2.bean.B2;
import digua.dagger2lean.test2.bean.Go2;
import digua.dagger2lean.test2.ioc.DaggerTest2Component;
import digua.dagger2lean.test3.bean.C1;
import digua.dagger2lean.test3.bean.Go3;
import digua.dagger2lean.test3.ioc.DaggerTest3Component;
import digua.dagger2lean.test3.ioc.Go3Qualifier;
import digua.dagger2lean.test3.ioc.Test3Module;
import digua.dagger2lean.test3.ioc.Test3Qualifier;

/**
 * @author digua
 *         <p>
 *         on 2017/2/7.(^ ^)
 */

public class Test3_Fragment extends BaseFragment {


    @Test3Qualifier("jack")
    @Inject
    C1 c1;


    @Test3Qualifier("tom")
    @Inject
    C1 c2;


    @Test3Qualifier("jerry")
    @Inject
    C1 c3;

    @Inject
    Go3 go3;

    @Override
    public View setupView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test3, container, false);
        return view;
    }

    /**
     * 点击事件
     */
    @OnClick({R.id.button})
    public void clickEvent(View view) {
        switch (view.getId()) {
            case R.id.button:
                sample();
                break;
        }
    }

    private void sample() {
        DaggerTest3Component.builder().build().inject(this);
        Log.i("test3", "name:" + c1.getName() + " age:" + c1.getAge() + " money:" + c1.getMoney());
        Log.i("test3", "name:" + c2.getName() + " age:" + c2.getAge() + " money:" + c2.getMoney());
        Log.i("test3", "name:" + c3.getName() + " age:" + c3.getAge() + " money:" + c3.getMoney());

        go3.print();
    }


}
