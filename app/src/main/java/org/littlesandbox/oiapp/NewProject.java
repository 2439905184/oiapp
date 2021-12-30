package org.littlesandbox.oiapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class NewProject extends Activity 
{
    private oiappWrapper oiappw;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createproject);
        oiappw = new oiappWrapper(this);
    }
    public void CreateProj(View v)
    {
     //   oiappw.fw();
         oiappw.uigo(ProjectInfo.class);
    }
}
