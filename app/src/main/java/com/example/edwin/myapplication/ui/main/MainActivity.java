package com.example.edwin.myapplication.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.edwin.myapplication.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private static final String TAG = "MainActivityTAG_";
    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter();
        presenter.attachView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.loadData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public void showProgress() {
        // TODO: 25/09/2017 Show ProgressBar
    }

    @Override
    public void hideProgress() {
        // TODO: 25/09/2017 Hide ProgressBar
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showResults(List<String> strings) {
        for (String string : strings) {
            Log.d(TAG, "showResults: " + string);
        }
    }
}
