package com.example.wangzixiong.easyshop.user.login;

import com.hannesdorfmann.mosby.mvp.MvpView;


public interface LoginView extends MvpView{

    void showPrb();

    void hidePrb();

    void loginFailed();

    void loginSuccess();

    void showMsg(String msg);
}
