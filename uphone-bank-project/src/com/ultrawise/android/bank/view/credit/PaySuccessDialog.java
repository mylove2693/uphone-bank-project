package com.ultrawise.android.bank.view.credit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.ultrawise.android.bank.view.credit.CreditCardBindDialog.BtnOkCL;
import com.ultrawise.android.bank.view.transfer.R;

public class PaySuccessDialog extends Activity {
	private int mobileNoFlag=0;
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.dialog);
	        
	        TextView tvflag = (TextView)findViewById(R.id.flag);
	    	TextView tvshow = (TextView)findViewById(R.id.info);
	    	Button btnok = (Button)findViewById(R.id.okBtn);
	    	
	        Intent receive_intent = getIntent();
	        String flag = receive_intent.getStringExtra("flag");
	        String info = receive_intent.getStringExtra("info");
	        tvflag.setText(flag);
	        tvshow.setText(info);
	        mobileNoFlag=Integer.parseInt(receive_intent.getStringExtra("mobileNoFlag"));
	        btnok.setOnClickListener(new BtnOkCL());
	    }
	    
	    class BtnOkCL implements OnClickListener{
			public void onClick(View v) {
		
	    }
	    }
}
