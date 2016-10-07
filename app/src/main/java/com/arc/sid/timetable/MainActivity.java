package com.arc.sid.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void Friday(View view) {
        startActivity(new Intent(this, Friday.class));
    }

    public void Monday(View view) {
        startActivity(new Intent(this, Monday.class));
    }

    public void Thursday(View view) {
        startActivity(new Intent(this, Thursday.class));
    }

    public void Tuesday(View view) {
        startActivity(new Intent(this, Tuesday.class));
    }

    public void Wednesday(View view) {
        startActivity(new Intent(this, Wednesday.class));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.menu.menu_main) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
