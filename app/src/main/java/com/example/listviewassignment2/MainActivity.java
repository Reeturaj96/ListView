package com.example.listviewassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    ListView listView;
    String name[];


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);

        name=getResources().getStringArray(R.array.Name);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent i=new Intent(MainActivity.this,SecondActivity.class);

                i.putExtra("name",name[position]);
                startActivity(i);
            }
        });

    }
}
