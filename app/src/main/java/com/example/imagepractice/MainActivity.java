package com.example.imagepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    RadioButton rbBird, rbSnake, rbTiger;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbTiger = findViewById(R.id.rbTiger);
        rbSnake = findViewById(R.id.rbSnake);
        rbBird = findViewById(R.id.rbBird);
        imageView = findViewById(R.id.imageView);

        rbTiger.setOnClickListener(this);
        rbBird.setOnClickListener(this);
        rbSnake.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.rbBird :
                imageView.setImageResource(R.drawable.bird);
                break;
            case R.id.rbSnake :
                imageView.setImageResource(R.drawable.snake);
                break;

            case R.id.rbTiger :
                imageView.setImageResource(R.drawable.tiger);
                break;

        }

    }
}
