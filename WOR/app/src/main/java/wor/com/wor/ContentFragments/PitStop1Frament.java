package wor.com.wor.ContentFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import wor.com.wor.R;

/**
 * Created by Santosh on 12/8/2016.
 */

public class PitStop1Frament extends Fragment {

    private static final String TAG = "PitStop1 Fragment";

    public PitStop1Frament() {
        // Required empty public constructor
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pitstop1, container, false);
        return rootView;
    }
}
