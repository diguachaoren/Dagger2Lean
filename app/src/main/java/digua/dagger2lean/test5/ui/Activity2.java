package digua.dagger2lean.test5.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import digua.dagger2lean.R;
import digua.dagger2lean.app.MainApplication;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.app.ioc.component.AppComponent;
import digua.dagger2lean.app.ioc.component.UserComponent;
import digua.dagger2lean.app.ioc.scope.UserScope;

/**
 * @author digua
 *         <p>
 *         on 2017/3/6.(^ ^)
 */

public class Activity2 extends Activity {

    @BindView(R.id.textview)
    TextView textView;

    @BindView(R.id.go)
    Button go;

    @Inject
    User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ButterKnife.bind(this);
        ((MainApplication) this.getApplication()).getUserComponent().inject(this);
        textView.setText("0: "+user.getName()+" "+user.toString());
        Log.i("Activity0","0: "+user.getName()+"  "+user.toString());
    }


    /**
     * 点击事件
     */
    @OnClick({R.id.go})
    public void clickEvent(View view) {
        switch (view.getId()) {
            case R.id.go:
                break;
        }
    }


}
