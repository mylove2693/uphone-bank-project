package com.ultrawise.android.bank.view.account_management;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout.LayoutParams;
import android.widget.TextView;

import com.ultrawise.android.bank.view.transfer.R;

public class AccountManagement extends Activity {
	private Button btnCoustom;
	private Button btnAccInfo;
	private Button btnActiveAcc;
	private Button btnLossRegister;
	private Button btnOrderCard;
	private TextView tvClassFirst;
	private TextView tvClassSecond;
	
	Intent intent;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.account_management);
		//���ò㼶��ϵ
		tvClassFirst = (TextView)this.findViewById(R.id.class_first);
		tvClassFirst.setText("�ֻ�����>");
		tvClassFirst.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// intent = QueryAccount.this.getIntent();
				// intent.setClass(QueryAccount.this, AccountManagement.class);
				// QueryAccount.this.startActivity(intent);

			}
		});
		tvClassSecond = (TextView)this.findViewById(R.id.class_second);
		tvClassSecond.setText("�˻�����");
		tvClassFirst.setVisibility(View.VISIBLE);
		tvClassSecond.setVisibility(View.VISIBLE);
		
		//���õײ��Զ��尴ť��ʾ
		btnCoustom = (Button)this.findViewById(R.id.btnCoustom);
		btnCoustom.setText("�˻�����");
		btnCoustom.setVisibility(View.VISIBLE);
		
		
		
		//Button Account Information
		btnAccInfo = (Button)this.findViewById(R.id.btnAccInfo);
		btnAccInfo.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				// TODO Auto-generated method stub
				intent = AccountManagement.this.getIntent();
				intent.setClass(AccountManagement.this, AccountInfo.class);
				AccountManagement.this.startActivity(intent);
			}
		});
		//Button Active Account
		btnActiveAcc = (Button)this.findViewById(R.id.btnActiveAcc);
		btnActiveAcc.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				intent = AccountManagement.this.getIntent();
				intent.setClass(AccountManagement.this, ActiveAccount.class);
				AccountManagement.this.startActivity(intent);
			}
		});
		
		//Button Loss Register
		btnLossRegister = (Button)this.findViewById(R.id.btnLossRegister);
		btnLossRegister.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				intent = AccountManagement.this.getIntent();
				intent.setClass(AccountManagement.this, LossRegister.class);
				AccountManagement.this.startActivity(intent);
			}
		});
		
		//Button Order Card
		btnOrderCard = (Button)this.findViewById(R.id.btnOrder);
		btnOrderCard.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				intent = AccountManagement.this.getIntent();
				intent.setClass(AccountManagement.this, OrderCard.class);
				AccountManagement.this.startActivity(intent);
			}
		});
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
}
