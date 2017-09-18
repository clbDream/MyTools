package com.clb.mytools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.clb.mytoolslibrary.DialogUtils;
import com.clb.mytoolslibrary.NetWorkUtil;
import com.clb.mytoolslibrary.SDCardUtil;
import com.clb.mytoolslibrary.ToastUtils;


public class MainActivity extends AppCompatActivity {

    private TextView tvVersionCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogUtils.showDialog(this, "通用的对话框", "弹出对话框", "取消", "确定", new DialogUtils.OnDialogClickListener() {
            @Override
            public void onCancleClick() {
                Toast.makeText(MainActivity.this, "取消", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onConfirmClick() {
                Toast.makeText(MainActivity.this, "确定", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
