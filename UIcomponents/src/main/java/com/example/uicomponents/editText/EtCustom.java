package com.example.uicomponents.editText;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.uicomponents.R;

public class EtCustom extends ConstraintLayout {
    public EditText Et;

    public enum TypeEditText{
        ACTIVE, DISACTIVE, ERROR
    }

    public EtCustom(@NonNull Context context){
        super(context);
        init(null);
    }

    public EtCustom(@NonNull Context context, @Nullable AttributeSet attributeSet){
        super(context, attributeSet);
        init(null);
    }

    public EtCustom(@NonNull Context context, @Nullable AttributeSet attributeSet, int defStyleAttr){
        super(context, attributeSet, defStyleAttr);
        init(null);
    }

    public void init(Integer idLayout){
        if(idLayout == null)
            return;

        LayoutInflater.from(this.getContext()).inflate(idLayout, this, true);
        Et = findViewById(R.id.et);
    }

    public void init(String name, String text, String hint, EtCustom.TypeEditText typeEditText){

        Et.setHint(hint);
        Et.setText(text);

        switch (typeEditText){
            case ACTIVE:
                Et.setBackgroundResource(R.drawable.et_active);
                Et.setTextColor(Color.BLACK);
                break;
            case DISACTIVE:
                Et.setBackgroundResource(R.drawable.et_disacitve);
                Et.setTextColor(Color.parseColor("#1a6fee"));
                break;
            case ERROR:
                Et.setBackgroundResource(R.drawable.et_error);
                Et.setTextColor(Color.parseColor("#2D2C2C"));
                break;
        }
    }

    @Override
    public void setEnabled(boolean enabled){
        super.setEnabled(enabled);
        Et.setEnabled(enabled);
    }
}
