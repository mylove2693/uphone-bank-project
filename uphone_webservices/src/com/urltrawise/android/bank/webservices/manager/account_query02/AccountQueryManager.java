package com.urltrawise.android.bank.webservices.manager.account_query02;

import com.urltrawise.android.bank.webservices.implement.account_query02.AccountDAOQuery;

public class AccountQueryManager {
	private AccountDAOQuery accountQueryDAO=null;
	private  static AccountQueryManager accountQueryMgr=null;
	private AccountQueryManager(){
	};
	static{						//������¾͵���
		if(accountQueryMgr==null){//���accountQueryM���ھ�ֱ�����ڴ������,��������ھ�ֱ�Ӵ���һ��
			accountQueryMgr=new AccountQueryManager(); 
			accountQueryMgr.setDao(new AccountDAOQuery());
		}
	}
	public static AccountQueryManager getInstance(){
		return accountQueryMgr;
	}
	private void setDao(AccountDAOQuery accountQueryDAO) {
		this.accountQueryDAO=accountQueryDAO;
	}
	//˽�з�ֹ������
	private AccountDAOQuery getDao() {
		return accountQueryDAO;
	}
	
	public String getAccountQueryById(String id)
	{
		return getQueryById(id);
	}
	private String getQueryById(String id) {
		return accountQueryDAO.getAccountQueryById(id);
	}
}
