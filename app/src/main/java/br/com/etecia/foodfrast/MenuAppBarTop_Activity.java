package br.com.etecia.foodfrast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuAppBarTop_Activity extends AppCompatActivity {
    //declarando a variavel global do objeto AppBar
    MaterialToolbar idToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_app_bar_top_layout);

        //Apresentando a toolbar xml para o java
        idToolbar = findViewById(R.id.idToolBar);



    }


}