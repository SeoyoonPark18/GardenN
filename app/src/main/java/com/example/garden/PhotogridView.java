package com.example.garden;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PhotogridView extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photogridview);

        gridView = findViewById(R.id.gridView);
        MyGridAdapter myGridAdapter = new MyGridAdapter(this);

        gridView.setAdapter(myGridAdapter);

        ImageButton back_btn = (ImageButton) findViewById(R.id.btnBack);
        back_btn.setColorFilter(Color.parseColor("#000000"));
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //버튼 클릭시 액티비티 전환
        ImageButton next_btn = (ImageButton) findViewById(R.id.btnNext);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PhotoUpload.class);
                startActivity(intent);
            }
        });
    }
}

