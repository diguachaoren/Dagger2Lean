package digua.dagger2lean.test5.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import digua.dagger2lean.R;
import digua.dagger2lean.app.MainApplication;
import digua.dagger2lean.app.bean.People;
import digua.dagger2lean.app.bean.User;
import digua.dagger2lean.test5.ioc.DaggerActivity0Component;

/**
 * @author digua
 *         <p>
 *         on 2017/3/13.(^ ^)
 */

public class Activity0 extends Activity {

    @BindView(R.id.textview)
    TextView textView;

    @BindView(R.id.go)
    Button go;

    @Inject
    User user;

    @Inject
    People people;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_0);
        ButterKnife.bind(this);

        DaggerActivity0Component
                .builder()
                .appComponent(((MainApplication) this.getApplication()).getComponent())
                .build().inject(this);

        textView.setText("0: "+user.getName()+" "+user.toString());
        Log.i("Activity0","0: "+user.getName()+"  "+user.toString());
        Log.i("Activity0","0: "+people.getName()+"  "+people.toString());
    }


    /**
     * 点击事件
     */
    @OnClick({R.id.go})
    public void clickEvent(View view) {
        switch (view.getId()) {
            case R.id.go:
                Intent intent = new Intent(this,Activity1.class);
                this.startActivity(intent);
                break;
        }
    }




}
