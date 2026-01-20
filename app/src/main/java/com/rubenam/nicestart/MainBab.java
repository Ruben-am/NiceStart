package com.rubenam.nicestart;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.rubenam.nicestart.databinding.ActivityMainBabBinding;

public class MainBab extends AppCompatActivity {

    private ActivityMainBabBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBabBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomAppBar bottomAppBar = binding.babMbMenu;
        FloatingActionButton myfab = binding.fabMbAdd;

        myfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainBab.this, "FAB Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainBab.this, "Menu clicked", Toast.LENGTH_SHORT).show();
            }
        });

        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.heart_menu_bottom) {
                    Toast.makeText(MainBab.this, "Added to favourites", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item.getItemId() == R.id.search_menu_bottom) {
                    Toast.makeText(MainBab.this, "Beginning search", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
    }
}