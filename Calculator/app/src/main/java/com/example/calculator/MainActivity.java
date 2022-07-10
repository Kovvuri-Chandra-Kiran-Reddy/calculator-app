package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import  android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        EditText et1 = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextNumber2);
        TextView tv = findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a = Integer.parseInt(et1.getText().toString());
                int b = Integer.parseInt(et2.getText().toString());
                int ans = a+b;

                tv.setText("Answer = " + ans);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a = Integer.parseInt(et1.getText().toString());
                int b = Integer.parseInt(et2.getText().toString());
                int ans = a-b;

                tv.setText("Answer = " + ans);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a = Integer.parseInt(et1.getText().toString());
                int b = Integer.parseInt(et2.getText().toString());
                int ans = a*b;

                tv.setText("Answer = " + ans);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int a = Integer.parseInt(et1.getText().toString());
                int b = Integer.parseInt(et2.getText().toString());
                try{
                    int ans = a/b;
                    tv.setText("Answer = " + ans);
                }
                catch(Exception e)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Divided by Zero Error", Toast.LENGTH_LONG);
                    toast.show();
                }



            }
        });
    }
}