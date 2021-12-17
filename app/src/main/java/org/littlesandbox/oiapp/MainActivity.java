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
<<<<<<< HEAD
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
=======
import android.widget.ListView;
import android.widget.Switch;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
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
        Log.d("main","调用反射");
        try
        {
            new JavaTokenizer().invoke(Class.forName("android.util.Log"));
        } catch(NoSuchMethodException e)
        {} catch(SecurityException e)
        {} catch(IllegalArgumentException e)
        {} catch(IllegalAccessException e)
        {} catch(InvocationTargetException e)
        {} catch(ClassNotFoundException e)
        {}
        /*       Intent i = new Intent(MainActivity.this,Example.class);
        startActivity(i);*/
    }
    //清空控制台
    public void cls(View v)
    {
        //用于获得悬浮窗列表内容 联创盒子项目
        //对象数组 
        ArrayList<View> av1 = new ArrayList()<View>;
        ArrayList<View> av2 = new ArrayList()<View>;
        ArrayList<View> av3 = new ArrayList()<View>;
        ArrayList<View> av4 = new ArrayList()<View>;
        ArrayList<View> av5 = new ArrayList()<View>;
        ArrayList<View> av6 = new ArrayList()<View>;
        ArrayList<View> av7 = new ArrayList()<View>;
        ArrayList<View> av8 = new ArrayList()<View>;
        ListView lv = new ListView(this);
        for(int i = 0;i<lv.getCount();i++)
        {
            LinearLayout root =(LinearLayout) lv.getItemAtPosition(i);
            for(int ti =0;ti<2;i++)
            {
                //获取每一个view
                View func_name  = root.getChildAt(i);
                av1.add(func_name);
                String classname = func_name.getClass().getName();
                if(classname.equals("TextView"))
                {
                   TextView tv =(TextView) func_name;
                   String name =tv.getText().toString();   
                   //av1.add();
                }
              if(classname.equals("Switch"))
              {
                  Switch sw = (Switch)func_name;
                  av1.add(sw);
                  //获取状态
                //  boolean check =sw.getTouchDelegate();
             //     av.add(check);
              }
            }  
        }
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
>>>>>>> refs/heads/future
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
