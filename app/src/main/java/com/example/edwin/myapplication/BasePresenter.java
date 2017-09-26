package com.example.edwin.myapplication;

/**
 * Created by Edwin on 25/09/2017.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();
}
