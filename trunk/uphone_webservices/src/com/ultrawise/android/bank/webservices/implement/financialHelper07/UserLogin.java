package com.ultrawise.android.bank.webservices.implement.financialHelper07;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;

public class UserLogin {
	
	public static List<String> createExtraCode(){
		
		List<String> result = new ArrayList<String>();
		Random ranBuild = new Random();
		int ran = ranBuild.nextInt(899) + 100;
		result.add(String.valueOf(ran));
		return result;
	}
	
	public static List<String> checkingUserLogin(InputStream inStream, String[] userLoginInfo){
		
		List<String> ratesData = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(inStream);
			NodeList nodeL = doc.getElementsByTagName("user");
//			Node no = nodeL.item(1);
//			NodeList xx = no.getChildNodes();
//			System.out.println(xx.item(1).getNodeName());
//			System.out.println(xx.item(1).getTextContent());
			
			for(int i = 0; i < nodeL.getLength(); i ++)
			{
				ratesData.clear();
				Node user = nodeL.item(i);
				NodeList userChild = user.getChildNodes();
				
				if(userChild.item(1).getTextContent().equals(userLoginInfo[1]))
				{
					
					if(userChild.item(3).getTextContent().equals(userLoginInfo[2]))
					{
						ratesData.add("true");
						ratesData.add(userChild.item(1).getTextContent());
						ratesData.add(userChild.item(5).getTextContent());
						ratesData.add(userChild.item(7).getTextContent());
						
					}else
					{
						ratesData.add("false");
						ratesData.add("user name or password error!");
					}
				}else
				{
					ratesData.add("false");
					ratesData.add("user name or password error!");
				}
				if(ratesData.get(0).equals("true"))
				{
					break;
				}
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return ratesData;
	}
	

}