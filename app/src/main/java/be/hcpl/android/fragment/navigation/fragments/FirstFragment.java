package be.hcpl.android.fragment.navigation.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import be.hcpl.android.fragment.navigation.OldMainActivity;
import be.hcpl.android.fragment.navigation.R;

/**
 * An example fragment that can be loaded in place
 */
public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // this is how we load a specific layout
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // and here our view is loaded

        ((TextView)view.findViewById(R.id.txtOnTop)).setText(new StringBuilder("You're now on ").append(this.getClass().getSimpleName()).toString());

        view.findViewById(R.id.btnFirstFragment).setEnabled(false);
        view.findViewById(R.id.btnSecondFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((OldMainActivity)getActivity()).switchFragment(SecondFragment.class);
            }
        });
        view.findViewById(R.id.btnThirdFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((OldMainActivity)getActivity()).switchFragment(ThirdFragment.class);
            }
        });
    }
}
