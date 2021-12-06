package org.littlesandbox.oiapp;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class iyu3Tokenizer
{
    //分离函数名称和参数

    public static String []split_func(String ppp)
    {
        return ppp.split("\\(|\\)");
    }
    public static String[] getParameters(String p_str)
    {
        //slower(a,b) a,b
        String[] parameters =  p_str.split(",");
        return parameters;
    }

    public static void tokenizer(String pp)
    {
        //初步分词 将函数名与函数参数分离
        String[] result;
        boolean check =pp.contains("(");
        boolean check2 = pp.contains(")");
        if(check&&check2)
        { //result = [" ",a,b,c"]第二个是函数参数
            result=split_func(pp);
            String name=result[0];
            //todo多个参数词法分析
            String p1 = result[1];
            Log.d("tokenizer","函数名:"+name);
            Log.d("tokenizer","参数:"+p1);
            if(name.equals("syso"))
            {
                /*TextView t = new TextView(ctx);
                 t.setText(p1.replace("\'",""));
                 console.addView(t);*/
            }
            if(name.equals("tw"))
            {
                Toast.makeText(MainActivity.ctx,p1,Toast.LENGTH_LONG).show();
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
            //大写
            if(name.equals("supper"))
            {
                String[] split_parameters =getParameters(result[1]);
                String final_result = split_parameters[0];
                new iyu3Interpreter().excute("supper",final_result);
            }
            //String.trim
            if(name.equals("strim"))
            {
                String[] split_parameters =getParameters(result[1]);
                String final_result = split_parameters[0];
                new iyu3Interpreter().excute("strim",final_result);
            }
            //转换为小写
            if(name.equals("slower"))
            {
                //aa,b分词后["aa","b"]
                String[] split_parameters =getParameters(result[1]);
                String final_result = split_parameters[0];
                new iyu3Interpreter().excute("slower",final_result);
            }
            if(name.equals("uigo"))
            {
                new iyu3Interpreter().excute("uigo",p1);
            }
            //截屏 ujp("%123.jpg", 70)图片品质
            if(name.equals("ujp"))
            {
                String[] split_parameters =getParameters(result[1]);
                String save_filename = split_parameters[0];
                int image_quality = Integer.getInteger(split_parameters[1]);
                // new iyu3Interpreter().excute(save_filename,image_quality);
            } else
            {
                Toast.makeText(MainActivity.ctx,"代码不正确",Toast.LENGTH_LONG).show();
            }
        }
    }    
}
