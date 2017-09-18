package com.uchiha.thanh.menukpt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
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
        getMenuInflater().inflate(R.menu.menu_demo,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuSetting:
                Toast.makeText(this, "Ban chon Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.email:
                Toast.makeText(this, "Ban chon EMAIL", Toast.LENGTH_SHORT).show();
                break;
            case R.id.phone:
                Toast.makeText(this, "Ban chon PHONE", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.menuExit:
                Toast.makeText(this, "Ban chon EXIT", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuSearch:
                Toast.makeText(this, "Ban chon EXIT", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuShare:
                Toast.makeText(this, "Ban chon SHARE", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
