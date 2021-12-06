package org.littlesandbox.oiapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import java.util.Arrays;
import android.content.Intent;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Context;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.support.design.widget.Snackbar;
import android.app.Application;
//开源版iapp实现
public class MainActivity extends Activity
{ 
    static LinearLayout console;
    static Context ctx;
    static Application app;
    public void example(View v)
    {
        
    }
    public void apis(View v)
    {
        Intent i = new Intent(MainActivity.this,Example.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        console=findViewById(R.id.console);
        //解析tw
        ctx=getApplicationContext();
        app = getApplication();
        Button run=findViewById(R.id.run);
   
        run.setOnClickListener(new OnClickListener()
            {
                @Override
                public void onClick(View p1)
                {
                    EditText et = findViewById(R.id.code);
                    String code =  et.getText().toString();
                    //以后代码移动到这里
                    iyu3Tokenizer.tokenizer(code);    
                  //  tokenizer(code);
                }
            });
    }
    //实现了单个h参数词法分析并运行 del
   /* public static void tokenizer(String pp)
    {
        boolean check =pp.contains("(");
        boolean check2 = pp.contains(")");
        if(check && check2)
        {
            String[] result=split_func(pp);
            String name=result[0];
            //todo多个参数词法分析
            String p1 = result[1];
            Log.d("tokenizer","函数名:"+name);
            Log.d("tokenizer","参数:"+p1);
            if(name.equals("syso"))
            {
                TextView t = new TextView(ctx);
                t.setText(p1.replace("\'",""));
             //   console.addView(t);
            }
            if(name.equals("tw"))
            {
                Toast.makeText(ctx,p1,Toast.LENGTH_LONG).show();
            }
            if(name.equals("end"))
            {
               new MainActivity().finish();
            }//有闪退bug
            if(name.equals("tws"))
            {
           // Snackbar.make(console,p1,Snackbar.LENGTH_LONG).show();
            }
            if(name.equals("loadso"))
            {
                System.loadLibrary(p1);
            }       
        } else
        {
            Toast.makeText(ctx,"代码不正确",Toast.LENGTH_LONG).show();
        }
    }*/
    //分离函数名称和参数
    public static String []split_func(String ppp)
    {
        return ppp.split("\\(|\\)");

    }
    public static String getParameters(String p_str)
    {
        //   p_str.
        return "";
      
    }
} 
