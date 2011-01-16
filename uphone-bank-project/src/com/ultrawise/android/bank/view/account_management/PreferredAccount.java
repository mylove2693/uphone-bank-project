package com.ultrawise.android.bank.view.account_management;

import java.util.ArrayList;
import java.util.HashMap;

import com.ultrawise.android.bank.view.transfer.R;


import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class PreferredAccount extends ListActivity {
	private Button btnCoustom;
	Intent intent;
	private int flag = 0;
	private TextView tvClassFirst;
	private TextView tvClassSecond;
	private TextView tvClassThrid;
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		// Eject dialog
		new AlertDialog.Builder(PreferredAccount.this)
				.setTitle("ȷ�϶Ի���")
				.setMessage("����Ϊ��ѡ�˻���")
				.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						// set preferred account
						flag = 1;// done
						Toast.makeText(PreferredAccount.this, "���óɹ�",
								Toast.LENGTH_SHORT).show();
						dialog.dismiss();
						finish();
					}
				})
				.setNegativeButton("ȡ��", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						flag = -1;
						dialog.dismiss();
						// finish();
					}
				}).show();
		if (flag == 1) {
			
		}
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.account_preferred);

		// ����List View
		intent = PreferredAccount.this.getIntent();
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

		SimpleAdapter sa = new SimpleAdapter(this, list,
				R.layout.account_management_textview_list, new String[] {
						"name", "arrow" }, new int[] { R.id.name, R.id.arrow });
		this.setListAdapter(sa);

		// ���ò㼶��ϵ
		tvClassFirst = (TextView) this.findViewById(R.id.class_first);
		tvClassFirst.setText("�ֻ�����>");
		tvClassFirst.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// intent = DeleteAccount.this.getIntent();
				// intent.setClass(DeleteAccount.this, AccountManagement.class);
				// DeleteAccount.this.startActivity(intent);
			}
		});
		tvClassSecond = (TextView) this.findViewById(R.id.class_second);
		tvClassSecond.setText("�˻�����>");
		tvClassSecond.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				intent = PreferredAccount.this.getIntent();
				intent.setClass(PreferredAccount.this, AccountManagement.class);
				PreferredAccount.this.startActivity(intent);
			}
		});
		tvClassThrid = (TextView) this.findViewById(R.id.class_third);
		tvClassThrid.setText("��ѡ�˻�");

		tvClassFirst.setVisibility(View.VISIBLE);
		tvClassSecond.setVisibility(View.VISIBLE);
		tvClassThrid.setVisibility(View.VISIBLE);

		// ���õײ��Զ��尴ť��ʾ
		btnCoustom = (Button) this.findViewById(R.id.btnCoustom);
		btnCoustom.setText("��ѡ�˻�");
		btnCoustom.setVisibility(View.VISIBLE);
	}

}
