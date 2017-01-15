package com.shraeyas.randomnumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static android.R.attr.label;

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

        EditText et ;
        Integer num;

        try
        {
            et = (EditText) findViewById(R.id.editText);
            num = Integer.parseInt(et.getText().toString());
        }

        catch(NumberFormatException e)
        {
            Toast.makeText(MainActivity.this, "Please Enter A number First", Toast.LENGTH_SHORT).show();
            return;
        }

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
                Toast.makeText(MainActivity.this, i + ", Yeah, That's Right, Lets do it One More Time", Toast.LENGTH_SHORT).show();
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
