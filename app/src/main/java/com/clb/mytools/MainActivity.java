package com.clb.mytools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.clb.mytoolslibrary.NetWorkUtil;
import com.clb.mytoolslibrary.SDCardUtil;
import com.clb.mytoolslibrary.ToastUtils;


public class MainActivity extends AppCompatActivity {

    private TextView tvVersionCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
