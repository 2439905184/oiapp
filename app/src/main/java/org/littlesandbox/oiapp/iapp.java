package org.littlesandbox.oiapp;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import java.io.File;
import android.os.FileUtils;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.app.ActionBar;

//wrapper封装类 用于兼容yu3语言
public class iapp extends Application
{
    public static  Context  ctx ;// super.getApplicationContext();
    public static void _getMIMEType()
    {
//删除这里获得当前调用堆栈
        StackTraceElement stack[] = Thread.currentThread().getStackTrace();  
        for(int i=0;i<stack.length;i++){
            System.out.print(stack[i].getClassName()+" 。"+stack[i].getMethodName()+"-----");
        }
        /**/
    }
    //调用系统打开文件
    public static void fo(String path)
    {
        File f = new File(path);
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.setDataAndType(Uri.fromFile(f),"application/a");
        new Activity().startActivity(i);
    }
    public static void tw(Object obj)
    {
        Toast.makeText(ctx,obj,Toast.LENGTH_LONG).show();
    }
    public static void tws()
    {

    }
    public static void uigo(String iyu)
    {
        Intent i = new Intent();
        //   startActivity(i);       
    }
    //发送短信📨 接受者电话号码 短信内容
    public static void usms(String receiver,String text)
    {
        Intent i =new Intent();
        i.setAction(Intent.ACTION_CALL);

        new Application().startActivity(i);
    }
    //打电话
    public static void ucall(String number)
    {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:"+number));
        //启动意图（活动界面）
        new Activity().startActivity(i);
    }
    //根据包名启动app
    public static boolean uapp(String package_name,Object result)
    {
        PackageManager pm = ctx.getPackageManager();
        Intent i = pm.getLaunchIntentForPackage(package_name);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        new Activity().startActivity(i);
        return true;
    }
    //根据类名启动app
    public static boolean uapp(String package_name,String class_name,Object result)
    {
        Intent i =new Intent();
        i.setClassName(package_name,class_name);
        new Activity().startActivity(i);
        return true;
    }
    //隐藏顶部状态栏
    public static void uycl(boolean bool)
    {
        View decorView =new Activity().getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        int uiOpen = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
        ActionBar actionBar = new Activity().getActionBar();      
        if(bool)
        {               
            // Remember that you should never show the action bar if the
            // status bar is hidden, so hide that too if necessary.
            decorView.setSystemUiVisibility(uiOptions);
            actionBar.hide();           
        } else
        {
        decorView.setSystemUiVisibility(uiOpen);
        actionBar.show();
        }
    }
    //true横屏 false竖屏 activity
    public static void ushsp(boolean bool)
    {
        Activity activity = new Activity();
        if(bool)
        {
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else
        {
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }
    //获取文件大小
    public static long fs(String path)
    {
        File f = new File(path);
        return f.length();
        //  InputStreamReader is = new InputStreamReader();
    }
    public static void us(int id,String properties,String value)
    {
        View v ;//=indViewById();
        String name =""; //=  v.getClass().getName();
        if(name.equals("TextView"))
        {

        }
        if(properties.equals("text"))
        {
            // (TextView)v.setText()"
        }
    }
}
