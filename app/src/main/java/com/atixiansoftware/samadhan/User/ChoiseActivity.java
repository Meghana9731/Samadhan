package com.atixiansoftware.samadhan.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.atixiansoftware.samadhan.R;

public class ChoiseActivity extends AppCompatActivity {

    CardView cardde,cardma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise);

        cardde = findViewById(R.id.card);
        cardde.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
            startActivity( intent );
            finish();
        });

        cardma = findViewById(R.id.card1);
        cardma.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(), Manufacture.class);
            startActivity( intent );
            finish();
        });
    }
}