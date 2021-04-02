package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recy;
    String names []={"charan","dharma","harsha","giri","kushal","akhil"};
    String rolls []={"515","520","530","523","549","201"};
    String phone []={"7882973671","8765987609","8184828384","9192939495","9697989192","8182838485"};
    String mailId []={"dulacharan@gmail.com","devildharma@gmail.com","heroharsha@gmail.com","ridergiri@gmail.com","babukushal@gmail.com","oyoakhil@gmail.com"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy=findViewById(R.id.gm);
        recy.setLayoutManager(new LinearLayoutManager(this));
        recy.setAdapter(new MydataAdapter(this,names,rolls,phone,mailId));
    }
}
