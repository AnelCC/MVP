package com.example.edwin.myapplication;

/**
 * Created by Edwin on 25/09/2017.
 */

public interface BaseView {
    void showProgress();
    void hideProgress();
    void showError(String error);
}
