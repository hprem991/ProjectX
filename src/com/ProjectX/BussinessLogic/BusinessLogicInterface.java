package com.ProjectX.BussinessLogic;

import java.lang.*;
import java.util.*;
import com.ProjectX.Dao.Object.ObjectInterface;

public interface BusinessLogicInterface {
	String getUserInfo(String userInfo);
	ArrayList<ObjectInterface> searchArea(Double aLongitute, Double aLatitute, int aRadius);
	
	//Services API
	
	// Storage API
	boolean Register(String aString);
	boolean setObject(ObjectInterface aObject);
	
	// Accessors API
	boolean Login(String userString); // you gotto be creative here coz we are not checking userName Password Combination
	
}
