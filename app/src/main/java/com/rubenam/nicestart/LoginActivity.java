package com.rubenam.nicestart;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
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
    }

    private void initListeners() {
        // login button
        binding.btnLoginLogin.setOnClickListener(view -> {
            String user = binding.etLoginUser.getText().toString().trim();
            String password = binding.etLoginPassword.getText().toString().trim();

            if (user.isEmpty() || password.isEmpty()) {
                new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                        .setTitleText("Error")
                        .setContentText("Introduce los datos para logearte")
                        .show();
            } else {
                new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Hola " + user)
                        .setContentText("Logeado correctamente")
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
        binding.btnLoginSingup.setOnClickListener(view -> {
            Intent intent = new Intent(this, SingUpActivity.class);
            startActivity(intent);
        });
    }
}