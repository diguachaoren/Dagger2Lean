package digua.dagger2lean;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import digua.dagger2lean.test1.ui.Test1_Fragment;
import digua.dagger2lean.test2.ui.Test2_Fragment;
import digua.dagger2lean.test3.ui.Test3_Fragment;
import digua.dagger2lean.test4.ui.Test4_Fragment;
import digua.dagger2lean.test5.ui.Activity0;
import digua.dagger2lean.test5.ui.Activity1;


/**
 * @author digua
 *         <p>
 *         on 2017/2/7.(^ ^)
 */

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        int target = getIntent().getBundleExtra("bundle").getInt("target");
        changePage(target);
    }

    /**
     * 切换页面
     */
    private void changePage(int target) {
        switch (target) {
            case R.id.test1:
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment, new Test1_Fragment()).commit();
                break;
            case R.id.test2:
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment, new Test2_Fragment()).commit();
                break;
            case R.id.test3:
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment, new Test3_Fragment()).commit();
                break;
            case R.id.test4:
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment, new Test4_Fragment()).commit();
                break;
            case R.id.test5:
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .add(R.id.fragment, new Test1_Fragment()).commit();

                Intent intent = new Intent(this, Activity0.class);
                this.startActivity(intent);
                finish();
                break;

        }
    }



}
