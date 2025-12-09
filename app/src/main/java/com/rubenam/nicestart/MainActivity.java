package com.rubenam.nicestart;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.bumptech.glide.Glide;
import com.rubenam.nicestart.databinding.ActivityLoginBinding;
import com.rubenam.nicestart.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        registerForContextMenu(binding.wvMainBkimg);

        loadImg();

        binding.srMainRefresh.setOnRefreshListener(mOnRefreshListener);
        // Glide.with(this).load("https://i.pinimg.com/1200x/a4/f3/ee/a4f3ee9e5e4bdd6222f026a050be49be.jpg").centerCrop().into(binding.ivMainBackground);
    }

    private void loadImg() {
        binding.wvMainBkimg.loadDataWithBaseURL(null, genImgString(), "text/html", "UTF-8", null);
    }

    private String genImgString() {

        String html = "<html>" +
                "<head><style>" +
                "html, body { margin:0; padding:0; height:100%; overflow:hidden; }" +
                "img { width:100%; height:100%; object-fit:cover; }" +
                "</style></head>" +
                "<body>" +
                "<img src='" + imageGen() + "' />" +
                "</body></html>";

        return html;
    }
    private int lastnumber = - 1;
    private String imageGen() {
        int num;
        do{
            num = 1 + (int)(Math.random() * 999);
        }while(num == lastnumber);
        lastnumber = num;

        String imageUrl = "https://thisbeachdoesnotexist.com/data/seeds-075/" + num+ ".jpg";
        Log.i("imagen", "imageGen: " + num);

        return imageUrl;
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.profile_menu_appbar) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        } else if (id == R.id.settings_menu_appbar) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.others_menu_appbar) {
            Toast.makeText(this, "Others", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            Toast toast0 = Toast.makeText(MainActivity.this, "Good job refreshing", Toast.LENGTH_LONG);
            toast0.show();


            binding.wvMainBkimg.reload();
            loadImg();
            binding.srMainRefresh.setRefreshing(false);
        }
    };
}