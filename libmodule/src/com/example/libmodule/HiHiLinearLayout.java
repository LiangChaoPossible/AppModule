/*
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package com.example.libmodule;

import com.mathutil.Suber;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by liangchao04 on 15/10/10.
 */
public class HiHiLinearLayout extends LinearLayout {
    public HiHiLinearLayout(Context context) {
        super(context);

        initUI(context);
    }

    public HiHiLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        initUI(context);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public HiHiLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        initUI(context);
    }

    private void initUI(Context context){
        LayoutInflater mInflater = LayoutInflater.from(context);
        View myView = mInflater.inflate(R.layout.hilayout, null);
        addView(myView);

        TextView tv = (TextView) myView.findViewById(R.id.tv11);
        Suber suber = new Suber();
        tv.setText("hihi val : " + suber.sub(10, 22));
    }
}
