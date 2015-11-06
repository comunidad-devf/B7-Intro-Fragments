package mx.devf.introfragments.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import mx.devf.introfragments.MainActivity;
import mx.devf.introfragments.R;
import mx.devf.introfragments.model.YuGiOh;

/**
 * Created by gerardogtn on 11/4/15.
 */
public class ListFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = "List Fragment";
    private YuGiOh[] mDeck = new YuGiOh[3];

    private ImageView mDragonBlanco;
    private ImageView mMagoOscuro;
    private ImageView mDragonNegro;

    private OnCardSelectedListener mListener;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_list, container, false);
        Log.e(TAG, "onCreateView");
        mDeck[0] = new YuGiOh("Dragon blanco de ojos azules", 3000, 2500, R.drawable.dragon_blanco);
        mDeck[1] = new YuGiOh("Mago oscuro"                 , 2500, 2100, R.drawable.mago_oscuro);
        mDeck[2] = new YuGiOh("Dragon negro de ojos rojos"  , 2400, 2000, R.drawable.dragon_negro);

        mListener = (MainActivity) getActivity();

        mDragonBlanco = (ImageView) view.findViewById(R.id.img_dragon_blanco);
        mMagoOscuro = (ImageView) view.findViewById(R.id.img_mago_oscuro);
        mDragonNegro = (ImageView) view.findViewById(R.id.img_dragon_negro);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");

        mDragonBlanco.setOnClickListener(this);
        mMagoOscuro.setOnClickListener(this);
        mDragonNegro.setOnClickListener(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "onDetach");
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.img_dragon_blanco){
            mListener.onCardSelected(mDeck[0]);
        } else if (view.getId() == R.id.img_mago_oscuro){
            mListener.onCardSelected(mDeck[1]);
        } else if (view.getId() == R.id.img_dragon_negro){
            mListener.onCardSelected(mDeck[2]);
        }
    }

    public interface OnCardSelectedListener{
        void onCardSelected(YuGiOh card);
    }
}
