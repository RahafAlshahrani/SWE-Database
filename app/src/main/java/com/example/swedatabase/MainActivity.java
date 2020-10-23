package com.example.swedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button add;
    EditText title , date ,time,location,type,des;

    Database db=new Database( this );
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        title= findViewById(R.id.title);
        date= findViewById(R.id.date);
        time= findViewById(R.id.time);
        location= findViewById(R.id.location);
        type= findViewById(R.id.type);
        des= findViewById(R.id.des);

        add=findViewById(R.id.add);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Event Event1;
                Database db;
                try {

                    Event1 = new Event(title.getText().toString(), Integer.parseInt(date.getText().toString()), Integer.parseInt(time.getText().toString()), location.getText().toString(), type.getText().toString(), des.getText().toString());


                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error creating event!", Toast.LENGTH_SHORT).show();
                    Event1=new Event("one",3,4,"ksu","gaming","not new event");
                }

                db = new Database(MainActivity.this);

                boolean success = db.addEvent(Event1);
                Toast.makeText(MainActivity.this, success+" Event added successfully  ", Toast.LENGTH_SHORT).show();

            }
    });
}


}
