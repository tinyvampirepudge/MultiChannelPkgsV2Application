package com.tiny.demo.multichannelpkgsv2application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.meituan.android.walle.WalleChannelReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String channel = WalleChannelReader.getChannel(this.getApplicationContext());
        Log.e("channel:",channel);
    }
}
