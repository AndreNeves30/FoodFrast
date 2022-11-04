package br.com.etecia.foodfrast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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

        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "oiiii",
                        Toast.LENGTH_SHORT).show();
            }
        });

        idToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mfavorite:
                        Toast.makeText(getApplicationContext(),
                                "Favorite",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.mMore:
                        Toast.makeText(getApplicationContext(),
                                "Mais",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                switch (item.getItemId()) {
                    case R.id.mSearch:
                        Toast.makeText(getApplicationContext(),
                                "Search",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }

        });

    }
}