package com.kristiandamas.applicationintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button move = findViewById(R.id.btn);
        Button a = findViewById(R.id.btn2);
        a.setOnClickListener(this);
        move.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn:
                Intent moveIntent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(moveIntent);
                break;
        }
        switch (v.getId()){
            case R.id.btn2:
                Intent moveIntent = new Intent(MainActivity.this,Main3Activity.class);
                moveIntent.putExtra(Main3Activity.EXTRA_NAME,"Kristian Damas Saputra");
                moveIntent.putExtra(Main3Activity.EXTRA_CLASS,"XII RPL 3");
                startActivity(moveIntent);
                break;

        }
    }

}
