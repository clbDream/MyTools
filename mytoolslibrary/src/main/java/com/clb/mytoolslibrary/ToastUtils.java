package com.clb.mytoolslibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * 弹吐司所需要的工具类，
 * 可以防止用户在疯狂点击之后，
 * 吐司不消失的情况发生
 */
public class ToastUtils {
    private static Toast toast;//在类前面声明吐司，确保在这个页面只有一个吐司

    /**
     * 弹吐司的方法
     *
     * @param context 上下文
     * @param msg     需要弹出的吐司内容
     */
    public static void showToast(Context context, String msg) {

        if (toast == null) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        } else {
            toast.cancel();//关闭吐司显示
            toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        }

        toast.show();//重新显示吐司
    }
}
