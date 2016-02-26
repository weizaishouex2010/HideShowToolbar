package com.huangzhiwei.hideshowtoolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(getString(R.string.app_name));
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId())
        {
            case R.id.One:intent.setClass(MainActivity.this,OneActivity.class);
                break;
            case R.id.Two:intent.setClass(MainActivity.this,TwoActivity.class);
                break;
            case R.id.Three:intent.setClass(MainActivity.this,ThirdActivity.class);
                break;
        }
        startActivity(intent);
    }
}
