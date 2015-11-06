package mx.devf.introfragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import mx.devf.introfragments.R;
import mx.devf.introfragments.model.YuGiOh;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    public static final String TAG = "Detail Fragment:";
    public static final String KEY_NAME = "name";
    public static final String KEY_IMAGE = "image_id";

    private ImageView mImage;
    private TextView  mName;

    public DetailFragment() {
        // Required empty public constructor
    }

    public static DetailFragment newInstance(String name, int imageId) {
        Bundle args = new Bundle();
        args.putInt(KEY_IMAGE, imageId);
        args.putString(KEY_NAME, name);
        DetailFragment fragment = new DetailFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "onAttach DYNAMIC");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate DYNAMIC");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_detail, container, false);
        Log.e(TAG, "onCreateView DYNAMIC");
        mImage = (ImageView) v.findViewById(R.id.img_detail);
        mName = (TextView) v.findViewById(R.id.txt_nombre);

        mImage.setImageResource(getArguments().getInt(KEY_IMAGE));
        mName.setText(getArguments().getString(KEY_NAME));
        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart DYNAMIC");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume DYNAMIC");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause DYNAMIC");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop DYNAMIC");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "onDestroyView DYNAMIC");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy DYNAMIC");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "onDetach DYNAMIC");
    }


    public void updateView(YuGiOh card) {
        Bundle args = getArguments();
        args.putString(KEY_NAME, card.getName());
        args.putInt(KEY_IMAGE, card.getmImageId());
        mImage.setImageResource(card.getmImageId());
        mName.setText(card.getName());
    }
}
