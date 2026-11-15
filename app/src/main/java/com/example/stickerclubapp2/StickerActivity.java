package com.example.stickerclubapp2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class StickerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stickeractivity);

        Button btnMail = findViewById(R.id.btn_mail);
        Button btnTrash = findViewById(R.id.btn_trash);
        Button btnFiles = findViewById(R.id.btn_files);
        Button btnSave = findViewById(R.id.btn_save);
        Button btnInternet = findViewById(R.id.btn_internet);
        Button btnNotes = findViewById(R.id.btn_notes);
        Button btnSunny = findViewById(R.id.btn_sunny);
        Button btnCats = findViewById(R.id.btn_cats);
        Button btnPicatsso = findViewById(R.id.btn_picatsso);

        btnMail.setOnClickListener(v -> Toast.makeText(this, "MAIL Opened!", Toast.LENGTH_SHORT).show());
        btnTrash.setOnClickListener(v -> Toast.makeText(this, "TRASH Opened!", Toast.LENGTH_SHORT).show());
        btnFiles.setOnClickListener(v -> Toast.makeText(this, "FILES Opened!", Toast.LENGTH_SHORT).show());
        btnSave.setOnClickListener(v -> Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show());
        btnInternet.setOnClickListener(v -> Toast.makeText(this, "INTERNET Opened!", Toast.LENGTH_SHORT).show());
        btnNotes.setOnClickListener(v -> Toast.makeText(this, "NOTES Opened!", Toast.LENGTH_SHORT).show());
        btnSunny.setOnClickListener(v -> Toast.makeText(this, "SUNNY!", Toast.LENGTH_SHORT).show());
        btnCats.setOnClickListener(v -> Toast.makeText(this, "TOO MANY CATS!", Toast.LENGTH_SHORT).show());
        btnPicatsso.setOnClickListener(v -> Toast.makeText(this, "PICATSSO Opened!", Toast.LENGTH_SHORT).show());
    }
}
