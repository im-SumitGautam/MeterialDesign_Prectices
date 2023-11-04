package com.bongo.meterialdesign_prectices;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText username = (TextInputEditText) findViewById(R.id.email);
        TextInputEditText password = (TextInputEditText) findViewById(R.id.pass);
        MaterialButton  btn = (MaterialButton) findViewById(R.id.login_btn);
        View google_btn = (View) findViewById(R.id.google_btn);
        View facebook_btn = (View) findViewById(R.id.facebook_btn);
        View twitter_btn = (View) findViewById(R.id.twitter_btn);

        MaterialTextView sign_up = (MaterialTextView) findViewById(R.id.sign_up);


        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Sign_Up.class);
//                startActivity(intent,
//                        ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                startActivity(intent);
                overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = username.getText().toString();
                Toast.makeText(MainActivity.this, ""+s, Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i,ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        });

        google_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Google!", Toast.LENGTH_SHORT).show();
            }
        });

        facebook_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Facebook!", Toast.LENGTH_SHORT).show();
            }
        });

        twitter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Twitter!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}