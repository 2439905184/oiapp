package org.littlesandbox.oiapp;
import android.content.Intent;
import android.content.Context;
import android.app.AlertDialog;
import android.widget.Toast;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//此类用于oiapp内部使用
public class oiappWrapper 
{
    //传入context 内部使用
   private Context oiapp_ctx;
   public oiappWrapper(Context ctx)
   {
       oiapp_ctx = ctx;
   }
   public  void uigo(Class<?> a)
   {
       Intent i = new Intent(oiapp_ctx,a);
       oiapp_ctx.startActivity(i);
   }
   public  void show_AlertDialog(String title ,String msg)
   {
       AlertDialog.Builder builder = new AlertDialog.Builder(oiapp_ctx);
       builder.setTitle(title);
       builder.setMessage(msg);
       builder.show();
   }
   public  void tw(Object obj)
   {
    //   (CharSequence)String.valueOf((Object)object), (int)1).show();
       Toast.makeText(oiapp_ctx,(CharSequence)String.valueOf(obj),Toast.LENGTH_SHORT).show();
   }
   //写txt文件
   public  void fw(String path,String txt) throws IOException
   {
       File f = new File(path);
       FileWriter fw = new FileWriter(f);
       fw.write(txt);
       fw.close();
   }
}
