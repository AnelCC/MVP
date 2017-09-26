package com.example.edwin.myapplication.ui.main;

import com.example.edwin.myapplication.BasePresenter;
import com.example.edwin.myapplication.BaseView;

import java.util.List;

/**
 * Created by Edwin on 25/09/2017.
 */

public interface MainContract {
    // All classes in my View layer are going to have to override (showResults, methods in BaseView)
    interface View extends BaseView {
        void showResults(List<String> strings);
    }

    // All classes in Presenter layer are going to have to override (loadData, methods on BasePresenter)
    // Presenter can only work with classes that have override MainContract.View
    interface Presenter extends BasePresenter<MainContract.View> {
        void loadData();
    }
}
