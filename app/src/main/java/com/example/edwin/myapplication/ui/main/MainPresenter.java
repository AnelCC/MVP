package com.example.edwin.myapplication.ui.main;

import com.example.edwin.myapplication.data.DataSource;

import java.util.List;

/**
 * Created by Edwin on 25/09/2017.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    private DataSource dataSource;

    public MainPresenter() {
        // Training purposes, in a best practices app, this would be injected through Dagger 2
        dataSource = new DataSource();
    }

    @Override
    public void attachView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void loadData() {
        view.showProgress();

        try {
            List<String> fakeData = dataSource.getFakeData();
            view.showResults(fakeData);
        } catch (Exception e) {
            view.showError(e.toString());
        }
        view.hideProgress();
    }
}
