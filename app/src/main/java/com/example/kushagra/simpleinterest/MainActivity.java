package com.example.kushagra.simpleinterest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView textView,textView3;
 EditText editText,editText2,editText3;
 Button button3,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView3=findViewById(R.id.textView3);
        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);
        button3=findViewById(R.id.button3);
        button2=findViewById(R.id.button2);
    }
    public void funa(View v)
    {
      int a=Integer.parseInt(editText.getText().toString());
      int b=Integer.parseInt(editText2.getText().toString());
      int c=Integer.parseInt(editText3.getText().toString());
      int d = a*b*c/100;
      textView3.setText("RESULT"+d);

    }
    public void funb(View v)
    {
        editText.setText("");
        editText2.setText("");
        editText3.setText("");
        textView3.setText("");
        editText.requestFocus();
    }
}
