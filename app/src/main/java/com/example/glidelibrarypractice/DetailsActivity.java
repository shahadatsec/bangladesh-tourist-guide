package com.example.glidelibrarypractice;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    ImageView coxsBazar, sajekValley, sundarBans, saintMartin, Srimangal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        coxsBazar = findViewById(R.id.coxsBazar);
        sajekValley = findViewById(R.id.sajekValley);
        sundarBans = findViewById(R.id.sundarBans);
        saintMartin = findViewById(R.id.saintMartin);
        Srimangal = findViewById(R.id.Srimangal);

        Glide.with(DetailsActivity.this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFZGdZ4Lm4-6FTXk29sN8jvtep5IlRRi8tTbbHjH9RHw&s=10")
                .placeholder(R.drawable.noimage)
                .error(R.drawable.error)
                .into(coxsBazar);

        Glide.with(DetailsActivity.this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTL17UuciBtAHRAuIpuqobXT3MdP2tNErzL0r4SaXJKA&s=10")
                .placeholder(R.drawable.noimage)
                .error(R.drawable.error)
                .into(sajekValley);

        Glide.with(DetailsActivity.this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRITq7-lM9k7a1JVzs6X91DaEk2f2HNsOzgT2ZcYjUdYg&s=10")
                .placeholder(R.drawable.noimage)
                .error(R.drawable.error)
                .into(sundarBans);

        Glide.with(DetailsActivity.this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5x56R3inStbA3Opu_1-W8wYH0gr1b2V5aMt0yTduwtw&s=10")
                .placeholder(R.drawable.noimage)
                .error(R.drawable.error)
                .into(saintMartin);

        Glide.with(DetailsActivity.this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSguen7jypAin7gV7P7GDu2Lg04ZsrtqoVgg_OoFTxggg&s=10")
                .placeholder(R.drawable.noimage)
                .error(R.drawable.error)
                .into(Srimangal);
    }
}