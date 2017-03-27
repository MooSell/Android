package com.designwall.moosell.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

/**
 * Created by scit on 3/23/17.
 */

public class Helper {
    public static void showDialog(Context context, String title, String message){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .show();
    }

    public static void showDialog(Context context, String title, String message, DialogInterface.OnClickListener onClickListener){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, onClickListener)
                .show();
    }

    public static String[] getPagesUrl(String url, int count){
        String[] result;
        int page;
        if (count <= 10){
            page = 1;
        }else {
            if (count % 10 == 0){
                page = count / 10;
            }else {
                page = count / 10 + 1;
            }
        }
        result = new String[page];
        for (int i = 0; i < page; i++){
            result[i] = url + "&page="+(i+1);
        }
        return result;
    }
}
