package com.ultrawise.android.bank;

import java.util.List;

public class Coustom {
	static String CoustomName = "������";
	private static List<Account> accActivation;
	private static List<Account> accUnActivation;

	public static List<Account> getAccActivation() {
		if (accActivation == null) {
			// Activation
			Account acc1 = new Account("4403011988102821", "�ҵĴ��", "���ڿ�",
					true, "��������������÷��֧��", "2006/07/09");
			Account acc2 = new Account("5560654220320266", "�ҵ����ÿ�", "���ڿ�",
					true, "��������������÷��֧��", "2007/08/08");
			Account acc3 = new Account("1122065468210030", "�ҵ�����", "���ڿ�", true,
					"��������������÷��֧��", "2008/09/07");
			accActivation.add(acc1);
			accActivation.add(acc2);
			accActivation.add(acc3);
		}
		return accActivation;
	}

	public static List<Account> getAccUnActivation() {
		// UnActivation
		if (accUnActivation == null) {
			Account acc4 = new Account("3322019830320266", "�ҵĵڶ����ÿ�", "���ڿ�",
					false, "��������������÷��֧��", "2009/10/06");
			Account acc5 = new Account("9574548189112338", "�ҵĽ�", "���ڿ�",
					false, "��������������÷��֧��", "2010/11/05");
			accUnActivation.add(acc4);
			accUnActivation.add(acc5);
		}
		return accUnActivation;
	}
}
