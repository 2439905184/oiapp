package org.littlesandbox.oiapp;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import java.util.Arrays;
import android.content.Intent;
import android.util.Log;
//开源版iapp实现
public class MainActivity extends Activity { 
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //解析tw
        
     /*   String p1= code.split("tw")[1];
       // String p1=Arrays.toString(o);
        String result_p1=p1.replaceAll("\\(|\\)"," ");
        Toast.makeText(this,result_p1,Toast.LENGTH_LONG).show();
       // Toast.makeText(this,Arrays.toString(o),Toast.LENGTH_LONG).show();
        String code2="uigo('abc.iyu')";
        String tmp2 = code2.split("uigo")[1];
        String p2=tmp2.replaceAll("\\(|\\)"," ");
        Toast.makeText(this,"页面"+p2,Toast.LENGTH_LONG).show();
        /*Intent i =new Intent(this,xxx.class)
        startActivity(i);*/
       String code3=" loadso('abc')";
        String tw="tw(123456)";
        String write_clipboard = "sxb('string)";
        String sit="uit(a, 'chooser', '标题')";
        tokenizer(tw);
        tokenizer(code3);
        tokenizer(write_clipboard);
        tokenizer(sit);
       }
       //实现了单个h参数词法分析
       public static void tokenizer(String pp)
       {
           
            String[] result=split_func(pp);
            String name=result[0];
            //todo多个参数词法分析
            String p1 = result[1];
          
           Log.d("tokenizer","函数名:"+name);
           Log.d("tokenizer","参数:"+p1);
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
