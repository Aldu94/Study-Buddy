package com.example.aldu.studbud;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button stundenPlan;
    private Button notenRechner;
    private Button profil;
    private Button einstellungen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        onStundenplanClicked();
        onNotenrechnerClicked();
        onProfilClicked();
        onEinstellungenClicked();

    }
    // setup buttons on main screen
    private void setupUI(){
        stundenPlan = (Button)findViewById(R.id.stundenplan_button);
        notenRechner = (Button)findViewById(R.id.notenrechner_button);
        profil = (Button)findViewById(R.id.profil_button);
        einstellungen = (Button)findViewById(R.id.einstellungen_button);
    }

    private void onStundenplanClicked(){
        stundenPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Stundenplan.class);
                startActivity(i);
            }
        });
    }

    private void onNotenrechnerClicked(){
        notenRechner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nrIntent = new Intent(MainActivity.this,Notenrechner.class);
                startActivity(nrIntent);
            }
        });
    }

    private void onProfilClicked(){
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilIntent = new Intent(MainActivity.this,Profil.class);
                startActivity(profilIntent);
            }
        });
    }

    private void onEinstellungenClicked(){
        einstellungen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent einstellungenIntent = new Intent(MainActivity.this,Einstellungen.class);
                startActivity(einstellungenIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
