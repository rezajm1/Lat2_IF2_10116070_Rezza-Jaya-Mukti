package com.example.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/*
Tanggal Buat:13 April 2019
NIM         :10116070
Nama        :Rezza Jaya Mukti
Kelas       :IF-2/AKB-2
 */
public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //mulai disini kalo edit
    public void register(View view) {
        Intent intent;
        intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
