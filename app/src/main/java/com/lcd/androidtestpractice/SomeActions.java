package com.lcd.androidtestpractice;

import android.content.Context;

/**
 * Created by hzlichengda on 2016/6/28.
 */
public class SomeActions {

    ActionsImp imp;

    public SomeActions(ActionsImp imp) {
        this.imp = imp;
    }

    public void noResultAction(int value){
        imp.doSomething(value);
    }

    public String getString(Context context, int resId){
        return context.getString(resId);
    }
}
