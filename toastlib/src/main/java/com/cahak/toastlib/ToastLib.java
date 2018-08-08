package com.cahak.toastlib;

import android.content.Context;
import android.widget.Toast;

public class ToastLib {

    public ToastLib() {
        //super(context)
    }

    public void showToast(Context context, String message, int toastLength){
        Toast.makeText(context, message, toastLength).show();
    }
}
