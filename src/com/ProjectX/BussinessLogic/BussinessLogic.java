package com.ProjectX.BussinessLogic;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import com.ProjectX.Dao.ConnectionManager;
//import com.ProjectX.Dao.Object.ObjectInterface;
import com.ProjectX.Dao.Object.ObjectInterface;


public class BussinessLogic implements BusinessLogicInterface, Callable {
	
	private ConnectionManager connManager;
	private String m_userInfo;
	
	public BussinessLogic(){
		connManager = new ConnectionManager();
	}
	
	public BussinessLogic(String someValue){
		connManager = new ConnectionManager();
		m_userInfo = someValue;
	}
	
	@Override
	public String getUserInfo(String userInfo) {
		// TODO Auto-generated method stub
		if(!userInfo.isEmpty()){
			// TODO, all Connection Object and extract DAO Layer
			connManager.getSomeValue(userInfo);
		}
		return null;
	}

	@Override
	public String call() throws Exception {
		return getUserInfo(m_userInfo);
		//return null;
	}

//	@Override
//	public ArrayList<ObjectInterface> searchArea(Double aLongitute, Double aLatitute, int aRadius) {
//		// TODO : Algo here is create a circular regions of aLontitute and aLatitute
//		double maxLatitute = aLatitute + aRadius;
//		double minLatitute = aLatitute - aRadius;
//		double maxLongitute = aLongitute + aRadius;
//		double minLongitute = aLongitute - aRadius;
//		return connManager.getObjectWithinRange(maxLatitute, maxLongitute, minLatitute, minLongitute);
//	}

	@Override
	public boolean Register(String aString) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public boolean setObject(ObjectInterface aObject) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean Login(String userString) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ObjectInterface> searchArea(Double aLongitute, Double aLatitute, int aRadius) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setObject(ObjectInterface aObject) {
		// TODO Auto-generated method stub
		return false;
	}
}
