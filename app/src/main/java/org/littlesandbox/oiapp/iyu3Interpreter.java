package org.littlesandbox.oiapp;
import android.widget.Toast;
import android.content.Intent;
//iyu v3解释器
public class iyu3Interpreter {
    public void excute(String action,String p)
    {
        if(action.equals("slower"))
        {
            String result_lower =p.toLowerCase();
            Toast.makeText(MainActivity.ctx,result_lower,Toast.LENGTH_LONG).show();
        }
        if(action.equals("supper"))
        {
            String result_bigger =p.toUpperCase();
            Toast.makeText(MainActivity.ctx,result_bigger,Toast.LENGTH_LONG).show();
        }
        if(action.equals("strim"))
        {
            String result_trim =p.trim();
            Toast.makeText(MainActivity.ctx,result_trim,Toast.LENGTH_LONG).show();
        }
        //这里还没有完全实现iyu
        if(action.equals("uigo"))
        {
            Intent i =new Intent (MainActivity.ctx,Example.class);
            MainActivity.app.startActivity(i);
        }
        
    }
    
    
}
