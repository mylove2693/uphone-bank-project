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

		// ����List View
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
		 * ҵ���ܣ���ʱ������
		 */
		/*
		 * // just add one account only if (addAccNum != null) { map4 = new
		 * HashMap<String, String>(); map4.put("name", addAccNum);
		 * map4.put("arrow", ">"); list.add(map4); } if (activeAcc != null) {
		 * map5 = new HashMap<String, String>(); map5.put("name", addAccNum);
		 * map5.put("arrow", ">"); list.add(map5); }
		 * 
		 * // just delete one account only if (delAccNum != null) { if
		 * (delAccNum.equalsIgnoreCase("5560654220320266")) list.remove(0); if
		 * (delAccNum.equalsIgnoreCase("1122065468210030")) list.remove(1); if
		 * (delAccNum.equalsIgnoreCase("3322019830320266")) list.remove(2); if
		 * (addAccNum != null) { if (delAccNum.equalsIgnoreCase(addAccNum))
		 * list.remove(map4); } if (activeAcc != null) {
		 * if(delAccNum.equalsIgnoreCase(activeAcc)) list.remove(map5); } }
		 */

		SimpleAdapter sa = new SimpleAdapter(this, list,
				R.layout.account_management_textview_list, new String[] {
						"name", "arrow" }, new int[] { R.id.name, R.id.arrow });
		this.setListAdapter(sa);

		// ���ò㼶��ϵ
		tvClassFirst = (TextView) this.findViewById(R.id.class_first);
		tvClassFirst.setText("�ֻ�����>");
		tvClassFirst.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// intent = QueryAccount.this.getIntent();
				// intent.setClass(QueryAccount.this, AccountManagement.class);
				// QueryAccount.this.startActivity(intent);

			}
		});
		tvClassSecond = (TextView) this.findViewById(R.id.class_second);
		tvClassSecond.setText("�˻�����>");
		tvClassSecond.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				 intent = QueryAccount.this.getIntent();
				 intent.setClass(QueryAccount.this, AccountManagement.class);
				 QueryAccount.this.startActivity(intent);
			}
		});
		tvClassThrid = (TextView) this.findViewById(R.id.class_third);
		tvClassThrid.setText("�˻���Ϣ>");
		tvClassThrid.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				 intent = QueryAccount.this.getIntent();
				 intent.setClass(QueryAccount.this, AccountInfo.class);
				 QueryAccount.this.startActivity(intent);
			}
		});
		tvClassFour = (TextView) this.findViewById(R.id.class_four);
		tvClassFour.setText("��ѯ�˻�");
		
		
		tvClassFirst.setVisibility(View.VISIBLE);
		tvClassSecond.setVisibility(View.VISIBLE);
		tvClassThrid.setVisibility(View.VISIBLE);
		tvClassFour.setVisibility(View.VISIBLE);

		// ���õײ��Զ��尴ť��ʾ
		btnCoustom = (ImageView) this.findViewById(R.id.btnCoustom);
		//btnCoustom.setImageResource(R.drawable.test2);
		btnCoustom.setVisibility(View.VISIBLE);

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		/**
		 * ҵ���ܣ���ʱ������
		 */
		/*
		 * String num = ""; String nickName = "�����ÿ�"; String type = "��"; Intent
		 * intent = new Intent(); if (id == 0) { num = "5560654220320266";
		 * nickName = "���ÿ�����"; type = "���ÿ�"; } else if (id == 1) { num =
		 * "1122065468210030"; nickName = "�ҵ�����"; type = "���"; } else if (id ==
		 * 2) { num = "3322019830320266"; nickName = "�ҵĵ�һ�����ÿ�"; type = "���ÿ�";
		 * }else if(id==3) { TextView tv = (TextView)v; num =
		 * tv.getText().toString(); }else if(id==4){ TextView tv = (TextView)v;
		 * num = tv.getText().toString(); } intent.putExtra("AccInfo", "�˺ţ�" +
		 * num + "\n" + "������" + nickName + "\n" + "�˻����ͣ�" + type + "\n" +
		 * "�˻�״̬������\n�Ƿ�ǩԼ��ǩԼ\n" + "�����У���������������÷��֧��\n" + "�����գ�2006/04/10");
		 */
		intent.setClass(QueryAccount.this, AccountInfo.class);
		QueryAccount.this.startActivity(intent);
	}
}
