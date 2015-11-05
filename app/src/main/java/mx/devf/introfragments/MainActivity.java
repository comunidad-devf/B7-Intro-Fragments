package mx.devf.introfragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import mx.devf.introfragments.fragments.DetailFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "Main Activity";
    private DetailFragment mFragment;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(TAG, "onCreate Activity");
        mFragment = new DetailFragment();
        mButton = (Button) findViewById(R.id.btn_next_activity);
        mButton.setOnClickListener(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container, mFragment);
        transaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG, "onResume Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG, "onRestart Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG, "onPause Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "onStop Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG, "onDestroy Activity");
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == mButton.getId()){
            Intent intent = new Intent(MainActivity.this, NextActivity.class);
            startActivity(intent);
        }
    }
}
