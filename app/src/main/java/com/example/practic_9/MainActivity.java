package com.example.practic_9;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.uicomponents.button.BtnBig;
import com.example.uicomponents.button.BtnCustom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        BtnBig btnPrimary = findViewById(R.id.btnPrimary);
        BtnBig btnEnable = findViewById(R.id.btnEnable);
        BtnBig btnTertiary = findViewById(R.id.btnTertiary);
        BtnBig btnSecondary = findViewById(R.id.btnSecondary);

        btnPrimary.init("Отправить", BtnCustom.TypeButton.PRIMARY);
        btnEnable.setEnabled(false);
        btnTertiary.init("Авторизоваться", BtnCustom.TypeButton.TERTIARY);
        btnSecondary.init("Забыли пароль????", BtnCustom.TypeButton.SECONDARY);
    }
}