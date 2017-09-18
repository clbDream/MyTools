package com.clb.mytoolslibrary;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017.09.18.0018.
 */

public class DialogUtils {
    // 通用Dialog
    public static Dialog showDialog(Context context, String title, String msg,
                                    String cancletext, String confirmId,
                                    final OnDialogClickListener listener) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_common, null);
        LinearLayout cancle, confirm;
        TextView dialog_title = view.findViewById(R.id.dialog_title);
        TextView dialog_message = view.findViewById(R.id.dialog_message);
        cancle = (LinearLayout) view.findViewById(R.id.dialog_cancle_button);
        confirm = (LinearLayout) view.findViewById(R.id.dialog_confirm_button);
        TextView dialog_cancle = view.findViewById(R.id.dialog_cancle_text);
        TextView dialog_confirm = view.findViewById(R.id.dialog_confirm_text);
        dialog_title.setText( title);
        dialog_message.setText(msg);
        dialog_cancle.setText( cancletext);
        dialog_confirm.setText(confirmId);

        final Dialog dialog = new Dialog(context, R.style.dialog_style);
        dialog.setContentView(view);

        cancle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onCancleClick();
                }
                dialog.dismiss();
            }
        });
        confirm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onConfirmClick();
                }
                dialog.dismiss();
            }
        });
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();
        return dialog;
    }

    // 通用Dialog interface
    public interface OnDialogClickListener {
        public void onCancleClick();

        public void onConfirmClick();
    }
}
