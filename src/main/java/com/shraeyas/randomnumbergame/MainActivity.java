package com.shraeyas.randomnumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    public static Integer rand()
    {
        Random r = new Random();
        Integer l = r.nextInt(20);

        return l;
    }

    static Integer i;

    public void check(View view)
    {
        //int i = rand();

        EditText et = (EditText) findViewById(R.id.editText);
        Integer num = Integer.parseInt(et.getText().toString());


        //while(i!=num)
        {

            if(i>num)
            {
                Toast.makeText(MainActivity.this, "More Than this", Toast.LENGTH_SHORT).show();
            }

            else if(i<num)
            {
                Toast.makeText(MainActivity.this, "Less Than this", Toast.LENGTH_SHORT).show();
            }

            else
            {
                Toast.makeText(MainActivity.this, "Thats Right", Toast.LENGTH_SHORT).show();
                i = rand();
            }
            //et =
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=rand();
    }
}
