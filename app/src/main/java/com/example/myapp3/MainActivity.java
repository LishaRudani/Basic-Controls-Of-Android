package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOptionMenu, btnListView,btnSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOptionMenu = findViewById(R.id.btn_optionMenu);
        btnOptionMenu.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this,OptionMenuActivity.class);
                    startActivity(intent);


        });
        btnListView = findViewById(R.id.btn_listview);
        btnListView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListViewActivity.class);
                startActivity(intent);
            }
        }));

        btnSpinner=findViewById(R.id.btn_spinner);
        btnSpinner.setOnClickListener((view)->{
            Intent intent=new Intent(MainActivity.this,SpinnerActivity.class);
             startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }
}


