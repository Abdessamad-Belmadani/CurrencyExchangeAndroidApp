package com.abdessamadbelmadani.androidexam.actions;


import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import com.abdessamadbelmadani.androidexam.MainActivity;


public class ChangeCurrency implements View.OnClickListener{

    private final EditText et1,et2;
    private final Spinner sp1,sp2;
    MainActivity mainActivity;


    public ChangeCurrency(MainActivity act) {
        this.mainActivity=act;
        this.et1 = act.getEt_c1();
        this.et2 = act.getEt_c2();
        this.sp1=act.getSp1();
        this.sp2=act.getSp2();

    }

    @Override
    public void onClick(View view) {
        String result;
        Double amount=Double.valueOf(et1.getText().toString());
        result=String.valueOf(mainActivity.getServices().getValueComparedTo(sp1.getSelectedItem().toString(),sp2.getSelectedItem().toString(),amount));
        et2.setText(result);
    }
}
