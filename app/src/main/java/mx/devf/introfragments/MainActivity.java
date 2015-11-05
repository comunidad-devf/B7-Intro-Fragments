package mx.devf.introfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(TAG, "onCreate Activity");
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
}
