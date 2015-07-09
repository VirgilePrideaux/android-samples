package com.myapplication;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Dialog {
    public static void alert(Context c, String title, String message, DialogInterface.OnClickListener callBack) {
        AlertDialog.Builder b = new AlertDialog.Builder(c);
        b.setTitle(title);
        b.setMessage(message);
        b.setNeutralButton(c.getString(android.R.string.ok), callBack);
        b.create().show();
    }

    public static android.app.Dialog progress(Context c, String title, String message) {
        ProgressDialog d = new ProgressDialog(c);
        d.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        d.setTitle(title);
        d.setMessage(message);
        d.show();
        return d;
    }
}
