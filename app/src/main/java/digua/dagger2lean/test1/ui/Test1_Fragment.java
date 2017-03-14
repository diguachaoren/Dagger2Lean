package digua.dagger2lean.test1.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import butterknife.OnClick;
import digua.dagger2lean.BaseFragment;
import digua.dagger2lean.R;
import digua.dagger2lean.test1.bean.A1;
import digua.dagger2lean.test1.bean.A2;
import digua.dagger2lean.test1.bean.Go1;
import digua.dagger2lean.test1.ioc.DaggerTest1Component;

/**
 * @author digua
 *         <p>
 *         on 2017/2/7.(^ ^)
 */

public class Test1_Fragment extends BaseFragment {

    @Inject
    A1 a1;

    @Inject
    A2 a2;

    @Inject
    Go1 go1;

    @Override
    public View setupView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container, false);
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

    private void sample(){
        DaggerTest1Component.builder().build().inject(this);
        Log.i("a1",""+a1.getName());
        Log.i("a2",""+a2.getName());
        go1.print();
    }


}
