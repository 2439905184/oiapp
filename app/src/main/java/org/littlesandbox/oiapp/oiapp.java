package org.littlesandbox.oiapp;

//wapper封装类兼容yu3 更符合java程序员思路
public class oiapp
{
    //数据文件路径
    public static String data_path;
    static class file
    {
        static int getSize(String path)
        {
            int size =888;
            return size;
        }
    }
    public oiapp()
    {
       // new file().getSize();
      oiapp.file.getSize(" ");
    }
     
    
}
