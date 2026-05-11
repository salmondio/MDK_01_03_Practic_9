package com.example.uicomponents.editText;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.uicomponents.R;

public class EtBig extends EtCustom{
    public EtBig(@NonNull Context context){
        super(context);
    }
    public EtBig(@NonNull Context context, @Nullable AttributeSet attributeSet){
        super(context, attributeSet);
    }
    public EtBig(@NonNull Context context, @Nullable AttributeSet attributeSet, int defStyleAttr){
        super(context, attributeSet, defStyleAttr);
    }


    @Override
    public void init(Integer idLayout){
        super.init(R.layout.edit_text);
    }
}
