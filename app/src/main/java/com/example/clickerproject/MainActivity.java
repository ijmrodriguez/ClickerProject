package com.example.clickerproject;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    ImageView dogImage;
    int currentImageIndex = 0;
    int[] dogImages = {R.drawable.dog1, R.drawable.dog2, R.drawable.dog3,
            R.drawable.dog4, R.drawable.dog5};
    int pressCount = 0;

    TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dogImage = findViewById(R.id.dogImage);
        counter = findViewById(R.id.counterTextView);
    }

    public void setDogs(View view)
    {
      currentImageIndex = (currentImageIndex + 1) % dogImages.length;
      dogImage.setImageResource(dogImages[currentImageIndex]);
      pressCount++;
      counter.setText("Press Count: " + pressCount);
    }
}