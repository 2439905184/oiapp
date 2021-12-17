package org.littlesandbox.oiapp;
import android.widget.Toast;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
//import
public class JavaTokenizer 
{
    //运算符
    public static final String oprater =".";
    public static final String add ="+";
    public static final String end_line =";";
    
    public void get_class(String class_name) throws ClassNotFoundException, SecurityException, NoSuchMethodException, InvocationTargetException, IllegalArgumentException, IllegalAccessException
    {
       Class cls= getClass().forName(class_name);
       Method method = cls.getMethod("makeText");
       method.invoke("Context","");
       
    //   method.invoke();
    }
    //反射调用
    public void invoke(Class cls) throws InvocationTargetException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException 
    {
      //  Class log =Class.forName(cls);
    //    Log.d("JAVA","invoke");
        Method []d =cls.getMethods();
        Log.d("Java",d[0].toString());
        Method dd = cls.getMethod("d",String.class,String.class);
        Log.d("反射方法",dd.toString());
        dd.invoke("Log","调用反射函数","666");
    //    .invoke("Log","Java","test");
     //   Toast.makeText(MainActivity.ctx,o,6000).show();
    }
    public static void JavaTokenizer(String JavaString)
    {
       /*Runtime rt=  Runtime.getRuntime();
       long max =  rt.maxMemory();*/
       String code = "java{Toast.makeText(this,'hello',0}";
       String code2 = "Toast.makeText()";
       StringBuilder code_class = new StringBuilder();
       for(int i=0;i<code.length();i++)
       {
          Character  each_char = code2.charAt(i);
          //取类名
          if(!each_char.equals("."))
          {
              code_class.append(each_char);
          }
       }
       //new JavaTokenizer().get_class(code_class.toString());
        
   }
   
    
}
