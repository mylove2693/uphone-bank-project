package com.ultrawise.android.bank.view.account_management;

import java.util.ArrayList;
import java.util.HashMap;

import com.ultrawise.android.bank.view.transfer.R;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class QueryAccount extends ListActivity {
	private ImageView btnCoustom;
	Intent intent;
	private TextView tvClassFirst;
	private TextView tvClassSecond;
	private TextView tvClassThrid;
	private TextView tvClassFour;

	// HashMap<String, String> map4;
	// HashMap<String, String> map5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.list_account);

		// List View
		intent = QueryAccount.this.getIntent();
		String delAccNum = intent.getStringExtra("delAccNum");
		String addAccNum = intent.getStringExtra("addAccNum");
		String activeAcc = intent.getStringExtra("activeAcc");

		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("name", "5560654220320266");
		map1.put("arrow", ">");
		list.add(map1);

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("name", "1122065468210030");
		map2.put("arrow", ">");
		list.add(map2);

		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("name", "3322019830320266");
		map3.put("arrow", ">");
		list.add(map3);
		/**
		 * 
		 */
		

		SimpleAdapter sa = new SimpleAdapter(this, list,
				R.layout.account_management_textview_list, new String[] {
						"name", "arrow" }, new int[] { R.id.name, R.id.arrow });
		this.setListAdapter(sa);

		// 
		tvClassFirst = (TextView) this.findViewById(R.id.class_first);
		tvClassFirst.setText("手机银行>");
		tvClassFirst.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// intent = QueryAccount.this.getIntent();
				// intent.setClass(QueryAccount.this, AccountManagement.class);
				// QueryAccount.this.startActivity(intent);

			}
		});
		tvClassSecond = (TextView) this.findViewById(R.id.class_second);
		tvClassSecond.setText("账户管理>");
		tvClassSecond.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				 intent = QueryAccount.this.getIntent();
				 intent.setClass(QueryAccount.this, AccountManagement.class);
				 QueryAccount.this.startActivity(intent);
			}
		});
		tvClassThrid = (TextView) this.findViewById(R.id.class_third);
		tvClassThrid.setText("账户信息>");
		tvClassThrid.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				 intent = QueryAccount.this.getIntent();
				 intent.setClass(QueryAccount.this, AccountInfo.class);
				 QueryAccount.this.startActivity(intent);
			}
		});
		tvClassFour = (TextView) this.findViewById(R.id.class_four);
		tvClassFour.setText("查询账户");
		
		
		tvClassFirst.setVisibility(View.VISIBLE);
		tvClassSecond.setVisibility(View.VISIBLE);
		tvClassThrid.setVisibility(View.VISIBLE);
		tvClassFour.setVisibility(View.VISIBLE);

		// 
		btnCoustom = (ImageView) this.findViewById(R.id.btnCoustom);
		btnCoustom.setImageResource(R.drawable.cardbg_zhgl_w);
		btnCoustom.setVisibility(View.VISIBLE);

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		intent.setClass(QueryAccount.this, AccountInfo.class);
		QueryAccount.this.startActivity(intent);
	}
}
