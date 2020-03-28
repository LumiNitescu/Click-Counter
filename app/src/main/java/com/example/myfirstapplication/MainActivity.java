package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView showValue;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showValue=(TextView) findViewById(R.id.textView);
    }


    public void count (View view)
    {
        TextView text= (TextView) findViewById(R.id.textView);
        counter++;
        text.setText("You've hit the button: "+ counter + " times");
        //text.setText(Integer.toString(counter));

        //showValue.setText(Integer.toString(counter));
    }


}

