package com.rubenam.nicestart;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.rubenam.nicestart.databinding.ActivityLoginBinding;
import cn.pedant.SweetAlert.SweetAlertDialog;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initListeners();

        Glide.with(this).load("https://i.pinimg.com/736x/be/76/92/be76924d3f0f2007b6804bdf6539fb15.jpg").centerCrop().into(binding.ivLoginBackground);
    }

    private void initListeners() {
        // login button
        binding.btnLoginLogin.setOnClickListener(view -> {
            String user = binding.etLoginUser.getText().toString().trim();
            String password = binding.etLoginPassword.getText().toString().trim();

            if (user.isEmpty() || password.isEmpty()) {
                new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                        .setTitleText("Error")
                        .setContentText("Enter the information to login")
                        .show();
            } else {
                new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Hello " + user)
                        .setConfirmText("Continue")
                        .setConfirmClickListener(sweetAlertDialog -> {
                            sweetAlertDialog.dismissWithAnimation();

                            android.content.SharedPreferences prefs = getSharedPreferences("user_data", MODE_PRIVATE);
                            android.content.SharedPreferences.Editor editor = prefs.edit();
                            editor.putString("current_user", user);
                            editor.apply();

                            Intent intent = new Intent(this, MainActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        })
                        .show();
            }
        });

        // sing up button
        binding.btnLoginSingup.setOnClickListener(view -> {
            Intent intent = new Intent(this, SingUpActivity.class);
            startActivity(intent);
        });
    }
}