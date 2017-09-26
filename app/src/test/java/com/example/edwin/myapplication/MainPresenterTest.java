package com.example.edwin.myapplication;

import com.example.edwin.myapplication.ui.main.MainActivity;
import com.example.edwin.myapplication.ui.main.MainContract;
import com.example.edwin.myapplication.ui.main.MainPresenter;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by anelelizabethcervantes on 9/25/17.
 */

public class MainPresenterTest {

    @Test
    public void aboutShow4Test() throws Exception {

        MainPresenter mainpresenter = new MainPresenter();
        mainpresenter.attachView(new MainContract.View() {
            @Override
            public void showResults(List<String> strings) {
                assertTrue(strings.size()== 4);
            }

            @Override
            public void showProgress() {

            }

            @Override
            public void hideProgress() {

            }

            @Override
            public void showError(String error) {

            }
        });
        mainpresenter.loadData();
    }
}
