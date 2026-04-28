package com.example.uicomponents.button;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.uicomponents.R;

public class BtnCustom extends ConstraintLayout {
    public Button Btn;

    public enum TypeButton{
        PRIMARY, TERTIARY, SECONDARY, OFF
    }

    public BtnCustom(@NonNull Context context){
        super(context);
        init(null);
    }

    public BtnCustom(@NonNull Context context, @Nullable AttributeSet attributeSet){
        super(context, attributeSet);
        init(null);
    }

    public BtnCustom(@NonNull Context context, @Nullable AttributeSet attributeSet, int defStyleAttr){
        super(context, attributeSet, defStyleAttr);
        init(null);
    }

    public void init(Integer idLayout){
        if(idLayout == null)
            return;

        LayoutInflater.from(this.getContext()).inflate(idLayout, this, true);
        Btn = findViewById(R.id.btn);
    }

    public void init(String value, TypeButton typeButton){
        Btn.setText(value);

        switch (typeButton){
            case PRIMARY:
                Btn.setBackgroundResource(R.drawable.btn_primary);
                Btn.setTextColor(Color.WHITE);
                break;
            case SECONDARY:
                Btn.setBackgroundResource(R.drawable.btn_secondary);
                Btn.setTextColor(Color.parseColor("#1a6fee"));
                break;
            case TERTIARY:
                Btn.setBackgroundResource(R.drawable.btn_tetriary);
                Btn.setTextColor(Color.parseColor("#2D2C2C"));
                break;
            case OFF:
                Btn.setBackgroundResource(R.drawable.btn_tetriary);
                Btn.setTextColor(Color.parseColor("#7E7E9A"));
                break;
        }
    }

    @Override
    public void setEnabled(boolean enabled){
        super.setEnabled(enabled);
        Btn.setEnabled(enabled);
    }
}
