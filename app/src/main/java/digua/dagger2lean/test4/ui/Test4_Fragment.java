package digua.dagger2lean.test4.ui;


import android.app.Application;
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
import digua.dagger2lean.app.MainApplication;
import digua.dagger2lean.app.bean.People;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.test3.bean.C1;
import digua.dagger2lean.test3.bean.Go3;
import digua.dagger2lean.test3.ioc.DaggerTest3Component;
import digua.dagger2lean.test3.ioc.Test3Qualifier;
import digua.dagger2lean.test4.ioc.DaggerTest4Component;

/**
 * @author digua
 *         <p>
 *         on 2017/2/7.(^ ^)
 */

public class Test4_Fragment extends BaseFragment {

    @Inject
    People user1;

    @Inject
    People user2;


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
        DaggerTest4Component
                .builder()
                .appComponent(((MainApplication) this.getActivity().getApplication()).getComponent())
                .build()
                .inject(this);
        Log.i("user","user=>"+user1.toString()+" "+user1.getName());
        Log.i("user","user=>"+user2.toString()+" "+user2.getName());
    }


}
