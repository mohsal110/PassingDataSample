package com.example.mohsal.passingdatasample;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * Created by mohsal on 11/30/2020.
 */

public class OnNameSelectedDialoge extends Dialog {
    public OnNameSelectedDialoge(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_name_dialoge);
    }
}
