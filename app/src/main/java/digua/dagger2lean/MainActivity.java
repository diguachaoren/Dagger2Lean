package digua.dagger2lean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * 点击事件
     */
    @OnClick({R.id.test1,
            R.id.test2,
            R.id.test3,
            R.id.test4,
            R.id.test5

    })
    public void clickEvent(View view) {
        switch (view.getId()) {
            case R.id.test1:
                jumpActivity(R.id.test1);
                break;
            case R.id.test2:
                jumpActivity(R.id.test2);
                break;
            case R.id.test3:
                jumpActivity(R.id.test3);
                break;
            case R.id.test4:
                jumpActivity(R.id.test4);
                break;
            case R.id.test5:
                jumpActivity(R.id.test5);
                break;
        }
    }

    /**
     * 跳转页面
     */
    private void jumpActivity(int target) {
        Intent intent = new Intent(this, ContentActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("target", target);
        intent.putExtra("bundle", bundle);
        startActivity(intent);
    }


}
