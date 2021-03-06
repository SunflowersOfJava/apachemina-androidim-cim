/**
 * probject:cim
 * @version 2.0
 * 
 * @author 3979434@qq.com
 */ 
package com.farsunset.ichat.example.app;



import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
 

public   class CommonBaseControl   {
	
	private ProgressDialog progressDialog;  
	
	Context mContent;
	
	
	public   CommonBaseControl(Context content)
	{
		 this.mContent = content;
	}
	
	
	
	public void showProgressDialog(String title,String message)
	{
		if(progressDialog==null)
		{
			
			 progressDialog = ProgressDialog.show(mContent, title, message, true, true);
		}else if(progressDialog.isShowing())
		{
			progressDialog.setTitle(title);
			progressDialog.setMessage(message);
		}
	
		progressDialog.show();
		
	}
	
	public void hideProgressDialog()
	{
	
		if(progressDialog!=null&&progressDialog.isShowing())
		{
			progressDialog.dismiss();
		}
		
	}
	
	public void showToask(String hint){
		
		   Toast toast=Toast.makeText(mContent,hint,Toast.LENGTH_SHORT);
		   toast.show();
	}
 
  
}
