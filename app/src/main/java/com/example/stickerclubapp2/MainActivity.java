package com.example.stickerclubapp2;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextToSpeech tts;
    private int currentIndex = 0;

    private String[] phrases = {
            "Hi!",
            "You are at Malaika's sticker club",
            "I am just a gurl",
            "Of course fairies are real, I exist!",
            "Shut up",
            "So berry cute",
            "Pretty girls read books",
            "I am just a girl with ideas",
            "Am I a fairy?",
            "It all happens for a reason",
            "You are what you love"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tts = new TextToSpeech(this, status -> {
            if (status == TextToSpeech.SUCCESS) {
                tts.setLanguage(Locale.US);
                tts.setPitch(1.4f);
                tts.setSpeechRate(0.9f);
            }
        });

        RelativeLayout mainLayout = findViewById(R.id.main_layout);
        mainLayout.setOnClickListener(v -> {
            tts.speak(phrases[currentIndex], TextToSpeech.QUEUE_FLUSH, null, null);
            currentIndex = (currentIndex + 1) % phrases.length;
        });

        TextView btnOpen = findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StickerActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
}