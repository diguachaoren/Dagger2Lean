package digua.dagger2lean;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;


/**
 * @author digua
 *         <p>
 *         on 2017/2/14.(^ ^)
 */

public abstract class BaseFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // View view = inflater.inflate(R.layout.fragment_a1, container, false);
        View view = setupView(inflater,container,savedInstanceState);
        ButterKnife.bind(this, view);
        return view;
    }

    // main view
    public abstract View setupView(LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState);


}
