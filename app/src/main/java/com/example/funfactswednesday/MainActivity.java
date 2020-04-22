package com.example.funfactswednesday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ColorWheel colorWheel = new ColorWheel();
    private FactBook factBook = new FactBook();
    private TextView factTextView;
    private Button showFactButton;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        constraintLayout = findViewById(R.id.funFactLayout);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = colorWheel.getColor();
                constraintLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                factTextView.setText(factBook.getFact());

            }
        });
    }
}
