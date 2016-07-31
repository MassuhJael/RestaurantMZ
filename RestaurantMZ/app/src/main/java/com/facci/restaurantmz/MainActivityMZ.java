package com.facci.restaurantmz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityMZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_mz);
    }

    public void click1(View v){
        Toast.makeText(MainActivityMZ.this,"Caldo de Gallina",Toast.LENGTH_SHORT).show();
    }
    public void click2(View v){
        Toast.makeText(MainActivityMZ.this,"Seco de Gallina",Toast.LENGTH_SHORT).show();
    }
    public void click3(View v){
        Toast.makeText(MainActivityMZ.this,"Viche",Toast.LENGTH_SHORT).show();
    }
    public void click4(View v){
        Toast.makeText(MainActivityMZ.this,"Encebollado",Toast.LENGTH_SHORT).show();
    }
    public void click5(View v){
        Toast.makeText(MainActivityMZ.this,"Ceviche",Toast.LENGTH_SHORT).show();
    }
    public void click6(View v){
        Toast.makeText(MainActivityMZ.this,"Tonga",Toast.LENGTH_SHORT).show();
    }
    public void click7(View v){
        Toast.makeText(MainActivityMZ.this,"Fritada",Toast.LENGTH_SHORT).show();
    }
}
