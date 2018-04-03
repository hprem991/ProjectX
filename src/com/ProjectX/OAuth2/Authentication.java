package com.ProjectX.OAuth2;

import java.lang.*;
import java.util.*;
import com.ProjectX.Dao.*;

// Android Authtication Post : - https://developer.android.com/training/id-auth/authenticate.html
//								 https://developers.google.com/android/guides/http-auth

public class Authentication {
	private String m_UserHashCode;
	private String m_UserName;
	private String m_Password;
	
	private ConnectionManager m_conn;
	
	// Temp DB to test the Service
	Map<String, Boolean> m_userDB; 
	
	
	public Authentication(){ 
				m_userDB = new HashMap<String, Boolean>();
				m_conn = new ConnectionManager();
				m_userDB.put("Prem", true);
				m_userDB.put("Ana", true);
				m_userDB.put("Rakesh", true);
	}
	
	/* userHashCode is something you store in App so that automatically login happens */
	public Authentication(String a_UserHashCode){ 
		m_UserHashCode = a_UserHashCode;
	}
	
	public Authentication(String aUserName, String aPassword) {
		m_UserName = aUserName;
		m_Password = aPassword;
	}
	
	
	public boolean userAuth2(String aUserName, String aPassword){
		//Put some logic of checking with DB entries
		
		
		return true;
	}
	
	public boolean userAuth2(String a_UserHashCode){
		
		//Put some logic of checking with DB entries
		
		
//		if(m_userDB.containsKey(m_UserHashCode)){
//			System.out.println("User Name Found!!! "+" userDb Size "+m_userDB.size()+" userName "+a_UserHashCode);
//			return true;
//		} else {
//			System.out.println("User Name Not Found!!! "+" userDb Size "+m_userDB.size()+" userName "+a_UserHashCode);
//			return false;
//		}
		
//		for(Map.Entry<String, Boolean> map : m_userDB.entrySet()){
//			if(map.getKey().equals(m_UserHashCode)){
//				return true;
//			} else {
//				System.out.println("User Name Not Found!!! "+" map Name "+map.getKey()+" userName "+a_UserHashCode);
//			}
//		}
//		
		String userName = m_conn.getLogin(a_UserHashCode);
		
		System.out.println("Output is "+userName+" userName "+a_UserHashCode);
		
		if(a_UserHashCode.equals(userName)){
			System.out.println(" Matched  "+a_UserHashCode);
			return true;
		} else {
			System.out.println(" UnMatched "+a_UserHashCode);
			return false;
		}

	}
	
}
