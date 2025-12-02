package com.rubenam.nicestart;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.rubenam.nicestart.databinding.ActivityLoginBinding;
import com.rubenam.nicestart.databinding.ActivitySingUpBinding;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class SingUpActivity extends AppCompatActivity {
    private ActivitySingUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySingUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initListeners();

        Glide.with(this).load("https://i.pinimg.com/736x/be/76/92/be76924d3f0f2007b6804bdf6539fb15.jpg").centerCrop().into(binding.ivSingupBackground);
    }

    private void initListeners() {
        // login button
        binding.btnSingupConfirm.setOnClickListener(view -> {
            String user = binding.etSingupUser.getText().toString().trim();
            String password = binding.etSingupPassword.getText().toString().trim();
            String cPassword = binding.etSingupPasswordconfirm.getText().toString().trim();

            if (user.isEmpty() || password.isEmpty() || cPassword.isEmpty()) {
                new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                        .setTitleText("Error")
                        .setContentText("Introduce los datos para registrarte")
                        .show();
            } else {
                new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Hola " + user)
                        .setContentText("Registrado correctamente")
                        .setConfirmText("Continuar")
                        .setConfirmClickListener(sweetAlertDialog -> {
                            sweetAlertDialog.dismissWithAnimation();

                            Intent intent = new Intent(this, MainActivity.class);
                            startActivity(intent);
                        })
                        .show();
            }
        });

        // sing up button
        binding.btnSingupCancel.setOnClickListener(view -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });
    }
}