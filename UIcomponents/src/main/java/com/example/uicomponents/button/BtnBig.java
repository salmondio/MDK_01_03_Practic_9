package com.example.uicomponents.button;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.uicomponents.R;

public class BtnBig extends BtnCustom{
    public BtnBig(@NonNull Context context){
        super(context);
    }
    public BtnBig(@NonNull Context context, @Nullable AttributeSet attributeSet){
        super(context, attributeSet);
    }
    public BtnBig(@NonNull Context context, @Nullable AttributeSet attributeSet, int defStyleAttr){
        super(context, attributeSet, defStyleAttr);
    }

    @Override
    public void init(Integer idLayout){
        super.init(R.layout.button);
    }
}
