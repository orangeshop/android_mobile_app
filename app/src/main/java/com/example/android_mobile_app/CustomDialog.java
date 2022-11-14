package com.example.android_mobile_app;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomDialog extends Dialog {
    private TextView txt_contents;
    private Button shutdownClick;

    public CustomDialog(@NonNull Context context, String contents,int i, int i1, int i2) {
        super(context);
        setContentView(R.layout.activity_custom_dialog);

        TextView year_month_day = (TextView)findViewById(R.id.textView5);
        year_month_day.setText(i + "년 " + i1 + "월 " + i2 + "일");
        txt_contents = findViewById(R.id.txt_contents);
        txt_contents.setText(contents);
        shutdownClick = findViewById(R.id.btn_shutdown);
        shutdownClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

    }
}
