package com.lcd.androidtestpractice;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hzlichengda on 2016/6/30.
 */
public class LocalReceiverTest {

    @Test
    public void testOnReceive() throws Exception {
        LocalReceiver localReceiver = new LocalReceiver();
        Intent intent = new Intent();
        intent.putExtra("key", "Hello Android Test!");//saved the key to somewhere
        localReceiver.onReceive(InstrumentationRegistry.getTargetContext(), intent);
        //do some asserts
        //assertEquals(getKeyFromSomeWhere(), "Hello Android Test!");
    }

}