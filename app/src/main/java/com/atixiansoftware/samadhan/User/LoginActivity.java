package com.atixiansoftware.samadhan.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.atixiansoftware.samadhan.R;

public class LoginActivity extends AppCompatActivity {

    CardView cardde,cardma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        Button bt=findViewById( R.id.cirLoginButton );
        bt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), HomeActivity.class);
                startActivity( intent );
            }
        } );

        cardde = findViewById(R.id.card);
        cardde.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
                startActivity( intent );
                finish();
            }
        } );

        cardma = findViewById(R.id.card1);
        cardma.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Manufacture.class);
                startActivity( intent );
                finish();
            }
        } );
    }
}