package com.ProjectX.Dao.Hibernate;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

import javax.persistence.*;

@Entity
@Table(name = "loginData")
public class LoginData {

	String m_userName;
	String m_passWord;
	String m_hashCode;
	
	public LoginData(){}
	public LoginData(String a_userName, String a_passWord){
		m_userName = a_userName;
		m_passWord = a_passWord;
	}
	
	public LoginData(String a_hashCode){
		m_hashCode = a_hashCode;
	}
	
//	public boolean isValid(){
//		if(!m_hashCode.isEmpty()){
//			
//		} else if(m_userName.isEmpty() || m_passWord.isEmpty()){
//			
//			  return false;
//		} else {
//			
//		}
//	}
	
}
