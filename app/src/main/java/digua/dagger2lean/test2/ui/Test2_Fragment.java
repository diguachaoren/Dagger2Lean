package digua.dagger2lean.test2.ui;


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
import digua.dagger2lean.test2.bean.B1;
import digua.dagger2lean.test2.bean.B2;
import digua.dagger2lean.test2.bean.Go2;
import digua.dagger2lean.test2.ioc.DaggerTest2Component;

/**
 * @author digua
 *         <p>
 *         on 2017/2/7.(^ ^)
 */

public class Test2_Fragment extends BaseFragment {


    @Inject
    String title;

    @Inject
    B1 b1;

    @Inject
    B2 b2;

    @Inject
    Go2 go2;



    @Override
    public View setupView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test2, container, false);
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
        DaggerTest2Component.builder().build().inject(this);
        Log.i("string","string:"+title.toString());
        Log.i("b1","b1:"+b1.getName());
        Log.i("b2","b2:"+b2.getAge());
        go2.print();

    }


}
