package com.example.wangzixiong.easyshop.main.me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangzixiong.easyshop.R;
import com.example.wangzixiong.easyshop.commons.ActivityUtils;
import com.example.wangzixiong.easyshop.user.login.LoginActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MeFragment extends Fragment{

    private ActivityUtils activityUtils;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null){
            view = inflater.inflate(R.layout.fragment_me,container,false);
            activityUtils = new ActivityUtils(this);
            ButterKnife.bind(this,view);
        }
        return view;
    }

    @OnClick({R.id.tv_person_info, R.id.tv_login, R.id.tv_person_goods, R.id.tv_goods_upload})
    public void onClick(View v){
        // TODO: 2017/6/23 0023 需要判断用户是否登录，从而觉得跳转的位置
        activityUtils.startActivity(LoginActivity.class);
    }

}
