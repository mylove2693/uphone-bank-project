package com.ultrawise.android.bank.view.credit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ultrawise.android.bank.view.transfer.R;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.SimpleAdapter;

public class CreditInfo_List extends ListActivity {
	private ImageButton ib=null;
	private String creditNo=null;
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.creditinfo);
	        String creditNo=this.getIntent().getStringExtra("creditNo");
	        //����ListView��ֵ��
	        ArrayList<HashMap<String,String>> list=new ArrayList<HashMap<String,String>>();
	        HashMap<String,String> map1=new HashMap<String,String>();
	        HashMap<String,String> map2=new HashMap<String,String>();
	        HashMap<String,String> map3=new HashMap<String,String>();
	        HashMap<String,String> map4=new HashMap<String,String>();
	        HashMap<String,String> map5=new HashMap<String,String>();
	        HashMap<String,String> map6=new HashMap<String,String>();
	        map1.put("creditinfo_key", "����");
	        map1.put("creditinfo_value", creditNo);
	        map2.put("creditinfo_key","���ö��");
	        map2.put("creditinfo_value", "5000");
	        map3.put("creditinfo_key","���ö��");
	        map3.put("creditinfo_value","3000");
	        map4.put("creditinfo_key", "ÿ�µ��˵���");
	        map4.put("creditinfo_value", "23��");
	        map5.put("creditinfo_key","����Ӧ�����");
	        map5.put("creditinfo_value", "400");
	        map6.put("creditinfo_key","���ڵ��ڻ�����");
	        map6.put("creditinfo_value","23��");
	        list.add(map1);
	        list.add(map2);
	        list.add(map3);
	        list.add(map4);
	        list.add(map5);
	        list.add(map6);
	        SimpleAdapter listAdapter=new SimpleAdapter(this,list,R.layout.creditinfolist,new String[]{"creditinfo_key","creditinfo_value"},new int[]{R.id.creditinfo_key,R.id.creditinfo_value});
	        setListAdapter(listAdapter);
	        ib=(ImageButton)findViewById(R.id.transactiondetails);
	        ib.setOnClickListener(new TransactiondetailsImageButtonListener());
	    }
	 	class TransactiondetailsImageButtonListener implements OnClickListener{

			public void onClick(View arg0) {
				ArrayList<HashMap<String,String>> transDetailInfos=new ArrayList<HashMap<String,String>>();
				HashMap<String,String> transDetailInfo1=new HashMap<String,String>();
				
				transDetailInfo1.put("��������", "2010��12��25��");
				transDetailInfo1.put("��������", "����");
				transDetailInfo1.put("���׽��","500");
				transDetailInfo1.put("���׽��","�ɹ�");
				
				HashMap<String,String> transDetailInfo2=new HashMap<String,String>();
				
				transDetailInfo2.put("��������", "2011��1��25��");
				transDetailInfo2.put("��������", "ˮ��");
				transDetailInfo2.put("���׽��","100");
				transDetailInfo2.put("���׽��","�ɹ�");
				
				transDetailInfos.add(transDetailInfo1);
				transDetailInfos.add(transDetailInfo2);
				
				Bundle bundle = new Bundle(); 
				bundle.putSerializable("transDetailInfos",transDetailInfos);

				Intent intent=new Intent();
				intent.putExtra("creditNo", creditNo);
				intent.putExtras(bundle); 
				intent.setClass(CreditInfo_List.this, TransactionDetailsList.class);
				CreditInfo_List.this.startActivity(intent); 
				
			}
	 		
	 	}
}
