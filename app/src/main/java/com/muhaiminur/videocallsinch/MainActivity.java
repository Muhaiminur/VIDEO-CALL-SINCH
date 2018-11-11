package com.muhaiminur.videocallsinch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.karan.churi.PermissionManager.PermissionManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.video_call)
    Button videoCall;

    PermissionManager permissionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        permissionManager = new PermissionManager() {
        };
        permissionManager.checkAndRequestPermissions(MainActivity.this);
    }

    @OnClick(R.id.video_call)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this,LoginActivity.class));
    }
}
