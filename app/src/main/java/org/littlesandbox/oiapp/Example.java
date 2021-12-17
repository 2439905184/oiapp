package org.littlesandbox.oiapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Example extends Activity
{
    private String code;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        TextView t=findViewById(R.id.code1);
        code=t.getText().toString();
        findViewById(R.id.run1).setOnClickListener(new Clicker());
    }
    class Clicker implements View.OnClickListener
    {

        @Override
        public void onClick(View p1)
        {
            iyu3Tokenizer.tokenizer(code);
        }


    }
}