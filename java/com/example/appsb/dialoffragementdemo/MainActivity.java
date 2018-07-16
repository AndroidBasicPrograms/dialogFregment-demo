package com.example.appsb.dialoffragementdemo;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        dialogFragment myDialogFragment = new dialogFragment();
        myDialogFragment.setCancelable(false);
        myDialogFragment.setStyle(DialogFragment.STYLE_NO_TITLE,R.style.MyDialog);
        myDialogFragment.show(fragmentManager,"ok");
    }
}
