package com.example.a10119251latihan3;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DoneActivity extends AppCompatActivity {

    @BindView(R.id.txtDoneTitle)
    TextView txtNama;
    @BindString(R.string.activation_beres)
    String beres;
    @BindString(R.string.activation_sudah_bisa)
    String sudahBisa;
    @BindString(R.string.activation_setiap)
    String setiap;
    @BindString(R.string.activation_buat)
    String buat;

    public static final String ID_EXTRA_MSG_EXIT = "com.apps.rizkiadam.latihan1.MSG_EXIT";

    private String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        ButterKnife.bind(this);
        bindExtra();
    }

    private void bindExtra(){
        Intent intent = getIntent();
        name = intent.getStringExtra(com.example.a10119251latihan3.BiodataActivity.ID_EXTRA_MSG);
        txtNama.setText(beres+" "+name+" "+sudahBisa+" "+name+" "+setiap+" "+name+" "+buat);
    }

    @OnClick(R.id.btnDoneNext)
    public void selesai(View view) {
        Intent intent = new Intent(this, com.example.a10119251latihan3.WelcomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra(ID_EXTRA_MSG_EXIT, true);
        startActivity(intent);
    }
}
