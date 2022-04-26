package com.example.a10119251latihan3;

import static com.example.a10119251latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }

    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}

//Tanggal Pengerjaan : 26 April 2022
//Deskripsi Pekerjaan :
//1. Memasukan asset drawable, layout, mipmap, dan res
//2. Membuat Activity WelcomeActivity, LoginCodeActivity, BiodataActivity, dan DoneActivity
//3. Memasukan Font
//4. Mengganti source code di AndroidManifest.xml
//5. Mengganti app_name di values string
//6. Memperbarui source code di build.gradle untuk library
//        implementation 'uk.co.chrisjenx:calligraphy:2.3.0'
//        implementation 'com.jakewharton:butterknife:10.2.3'
//        annotationProcessor 'com.jakewharton:butterknife-compiler:10.2.3'
//7. Menambahkan android.enableJetifier=true di gradle.prperties
//8. Mengganti dan Menambahkan library di build.gradle berupa
//        implementation 'com.android.support:appcompat-v7:28.0.0'
//        implementation 'androidx.appcompat:appcompat:1.3.0'
//        implementation 'com.google.android.material:material:1.4.0'
//9. Mengganti compileSdk dan targetSdk menjadi 28
//10. Menghapus sebagian source code di settings.gradle
//NIM :10119251
//Nama :Muhamad Ridwan
//Kelas :IF6
