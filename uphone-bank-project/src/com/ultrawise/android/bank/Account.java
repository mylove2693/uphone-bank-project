package com.ultrawise.android.bank;

public class Account {
	String accNum;
	String accNickName;
	String accType;// �˻�����
	boolean accActivation;// �˻��Ƿ񼤻�
	String accOpenStation;// ������
	String accOpenDate;// ������

	public Account(String accNum, String accNickName, String accType,
			boolean accActivation, String accOpenStation, String accOpenDate) {
		this.accNum = accNum;
		this.accNickName = accNickName;
		this.accType = accType;
		this.accActivation = accActivation;
		this.accOpenStation = accOpenStation;
		this.accOpenDate = accOpenDate;
	}
}
