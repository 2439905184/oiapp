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
import android.widget.ListView;
import android.widget.Switch;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import android.graphics.Color;
//开源版iapp实现
public class MainActivity extends Activity
{ 
   public static LinearLayout console;
   public static Context ctx;
   public  static Application app;
    public void example(View v)
    {
        Intent i = new Intent(MainActivity.this,Example.class);
        startActivity(i);
    }
    //已经实现的api
    public void apis(View v)
    {
      /*  Log.d("main","调用反射");
        try
        {
            new JavaTokenizer().invoke(Class.forName("android.util.Log"));
        } catch(NoSuchMethodException e)
        {} catch(SecurityException e)
        {} catch(IllegalArgumentException e)
        {} catch(IllegalAccessException e)
        {} catch(InvocationTargetException e)
        {} catch(ClassNotFoundException e)
        {}*/
        Intent i = new Intent(MainActivity.this,Example.class);
        startActivity(i);
    }
    //清空控制台
    public void cls(View v)
    {
       console.removeAllViews();
       TextView tip =new TextView(this);
       tip.setText("oiyu解释器 alpha0.1");
       tip.setTextColor(Color.WHITE);
       console.addView(tip);
     //   lv.getAdapter().getItem(0);
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
              
                }
            });
    }
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
