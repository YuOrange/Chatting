package com.chatting;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            if (msg.what == 0) {
//                Intent intent = new Intent(MainActivity.this,secent.class);
//                startActivity(intent);
                Toast.makeText(MainActivity.this, "该跳转了", Toast.LENGTH_SHORT).show();
            }
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler.sendEmptyMessageDelayed(0, 2000);
    }
}
