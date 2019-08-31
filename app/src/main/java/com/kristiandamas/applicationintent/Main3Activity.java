package com.kristiandamas.applicationintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    public static final String EXTRA_NAME ="extra_name";
    public static final String EXTRA_CLASS ="extra_class";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView tvdata = findViewById(R.id.tv);

        String name =getIntent().getStringExtra(EXTRA_NAME);
        String kelas =getIntent().getStringExtra(EXTRA_CLASS);

        String text= "nama : "+name + "\nkelas : "+kelas;
        tvdata.setText(text);

        Toast.makeText(getApplicationContext(),"Data Received",Toast.LENGTH_LONG).show();

    }
}
