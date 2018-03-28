package com.ProjectX.OAuth2;

import java.lang.*;
import java.util.*;

// Android Authtication Post : - https://developer.android.com/training/id-auth/authenticate.html
//								 https://developers.google.com/android/guides/http-auth

public class Authentication {
	private String m_UserHashCode;
	private String m_UserName;
	private String m_Password;
	
	// Temp DB to test the Service
	Map<String, Boolean> m_userDB; 
	
	
	public Authentication(){ 
				m_userDB = new HashMap<String, Boolean>();
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
		
		if(m_userDB.containsKey(m_UserHashCode)){
			return true;
		} else {
			return false;
		}
//		for(Map.Entry<String, Boolean> map : m_userDB.entrySet()){
//			if(map.)
//		}
	}
	
}
