package com.example.efcs.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  (Button) findViewById(R.id.button_comer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comercookie(v);
            }
        });
    }

    /*
     * Llamada cuando se come la galleta
      */
    public void comercookie(View view){
        imageView = (ImageView) findViewById(R.id.imageView_antes);
        textView = (TextView) findViewById(R.id.textView_hambriento);

        textView.setText(R.string.estoy_lleno);
        imageView.setImageResource(R.drawable.aftercookie);

    }
}
