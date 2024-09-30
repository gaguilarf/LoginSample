package com.example.loginsample;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.loginsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        EditText editUsername = binding.editUsername;
        EditText editPassword = binding.editPassword;
        Button btnLogin = binding.btnLogin;

        btnLogin.setOnClickListener(view1 -> {
            if(editUsername.getText().toString().equals("admin") && editPassword.getText().toString().equals("admin")){
                Toast.makeText(getApplicationContext(), "Bienvenido a mi app",Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Bienvenido a mi app");
            } else {
                Toast.makeText(getApplicationContext(), "Error en la autenticacion",Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Error en la autenticacion");
            }
        });

    }
}