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
            case R.id.mWifi:
                Toast.makeText(getApplicationContext(),
                        "To com internet",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBlubluth:
                Toast.makeText(getApplicationContext(),
                        "Your blutooth device has been conected",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mVibra:
                Toast.makeText(getApplicationContext(),
                        "Vibra",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBat:
                Toast.makeText(getApplicationContext(),
                        "Sei quanto de bateria tem n",
                        Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}

