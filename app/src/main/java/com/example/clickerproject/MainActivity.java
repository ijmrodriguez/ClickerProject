package com.example.clickerproject;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    String[] dogs = {"dog1", "dog2", "dog3", "dogs4", "dog5"};
    ImageView dogImage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dogImage = findViewById(R.id.dogImage);
    }

    public void setDogs(View view)
    {
        for (String dog : dogs) {
            int resourceId = getResources().getIdentifier(dog, "drawable", getPackageName());
            dogImage.setImageResource(resourceId);
        }
    }
}