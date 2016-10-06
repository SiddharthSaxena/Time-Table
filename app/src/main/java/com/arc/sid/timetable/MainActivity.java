package com.arc.sid.timetable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity
        extends AppCompatActivity
{
    public void Friday(View paramView)
    {
        startActivity(new Intent(this, Friday.class));
    }

    public void Monday(View paramView)
    {
        startActivity(new Intent(this, Monday.class));
    }

    public void Thursday(View paramView)
    {
        startActivity(new Intent(this, Thursday.class));
    }

    public void Tuesday(View paramView)
    {
        startActivity(new Intent(this, Tuesday.class));
    }

    public void Wednesday(View paramView)
    {
        startActivity(new Intent(this, Wednesday.class));
    }

    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(2130903066);
    }

    public boolean onCreateOptionsMenu(Menu paramMenu)
    {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem paramMenuItem)
    {
        if (paramMenuItem.getItemId() == 2131427438) {
            return true;
        }
        return super.onOptionsItemSelected(paramMenuItem);
    }
}
