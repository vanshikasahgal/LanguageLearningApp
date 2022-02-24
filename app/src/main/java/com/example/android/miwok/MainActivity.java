package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);

            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);

        colors.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);

            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);

        phrases.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);

            }
        });

    }

}