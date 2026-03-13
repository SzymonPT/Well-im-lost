package com.onaar.nowa;

import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int ileSekund;

    TextView textViewCzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textViewCzas = findViewById(R.id.textViewCzas);
        Handler handler = new Handler();
        handler.post(
                new Runnable() {
                    @Override
                    public void run() {
                        ileSekund++;
                        textViewCzas.setText(""+ileSekund);
                        handler.postDelayed(this, 1000);
                    }
                }
            );
        }
    }