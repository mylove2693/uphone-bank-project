package com.ultrawise.android.bank.view.credit;

import com.ultrawise.android.bank.view.transfer.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivateCard extends Activity {
	private Button activateCardButton=null;
	private EditText activateCardNumberEditText=null;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activatecard);
        activateCardButton=(Button)findViewById(R.id.activateCard);
        activateCardButton.setOnClickListener(new ActivateCardButtonListener());
        activateCardNumberEditText=(EditText)findViewById(R.id.activateCardNumber);
	}
	class ActivateCardButtonListener implements OnClickListener{

		public void onClick(View arg0) {
			String creditNo=activateCardNumberEditText.getText().toString();
			Toast.makeText(ActivateCard.this, "��ϲ�㣬���Ѿ�ͨ���ֻ��ɹ������˿���Ϊ"+creditNo+"���ÿ����ֻ�����ҵ��ͨ���񣬴˿��������𽫲�����ʹ�ã�", Toast.LENGTH_SHORT).show();
			
		}
		
	}
}
