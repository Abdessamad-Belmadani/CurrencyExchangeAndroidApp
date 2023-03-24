package com.abdessamadbelmadani.androidexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.abdessamadbelmadani.androidexam.actions.ChangeCurrency;
import com.abdessamadbelmadani.androidexam.buisness.DefaultServices;
import com.abdessamadbelmadani.androidexam.buisness.Services;
import com.abdessamadbelmadani.androidexam.dao.CurrencyMemoryDao;


public class MainActivity extends AppCompatActivity {
    private EditText et_c1,et_c2;
    private Spinner sp1;
    private Spinner sp2;

    public EditText getEt_c1() {
        return et_c1;
    }

    public EditText getEt_c2() {
        return et_c2;
    }

    public Services getServices() {
        return services;
    }

    public Spinner getSp1() {
        return sp1;
    }

    public Spinner getSp2() {
        return sp2;
    }

    private Services services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        services=new DefaultServices(new CurrencyMemoryDao());

        sp1=findViewById(R.id.spinner1);
        sp2=findViewById(R.id.spinner2);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, services.getCodes());
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        sp1.setAdapter(adapter);
        sp2.setAdapter(adapter);

        Button btnChange = findViewById(R.id.button);
        Button btnAlter=findViewById(R.id.button2);

        btnAlter.setOnClickListener(view -> {
            int selected1 = sp1.getSelectedItemPosition();
            int selected2 = sp2.getSelectedItemPosition();

            sp1.setSelection(selected2);
            sp2.setSelection(selected1);

            btnChange.callOnClick();

        });


        et_c1=findViewById(R.id.c1);
        et_c2=findViewById(R.id.c2);

        btnChange.setOnClickListener(new ChangeCurrency(this));

    }
}