package br.com.etecia.foodfrast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFav:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no fav",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBus:
                Toast.makeText(getApplicationContext(),
                        "Cliquei nessa coisa ai",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfif:
                Toast.makeText(getApplicationContext(),
                        "Cliquei nos confif",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHist:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no lugar proibido",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mAbout:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no negocio",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mShare:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no chare",
                        Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}

