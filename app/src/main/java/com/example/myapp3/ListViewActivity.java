package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    String name[]={"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView =findViewById(R.id.listview1);
        ArrayAdapter arrayAdapter=new ArrayAdapter(ListViewActivity.this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(ListViewActivity.this, name[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}