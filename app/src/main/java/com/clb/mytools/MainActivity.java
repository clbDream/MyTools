package com.clb.mytools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.clb.mytoolslibrary.ToastUtils;
import com.clb.mytoolslibrary.VersionUtils;

public class MainActivity extends AppCompatActivity {

    private TextView tvVersionCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取应用的版本号
        tvVersionCode = (TextView) findViewById(R.id.tv_version_code);
        tvVersionCode.setText(VersionUtils.getAppVersionCode(this)+"");
    }
}
