package com.ProjectX.Dao.Object;

import java.lang.*;
import java.util.*;

public class TestObject implements ObjectInterface {
	private String mObjectType;
	
	@Override
	public void setObjectType(ObjectType aObjectType) {
		// TODO Auto-generated method stub
		switch(aObjectType){
			case SAMPLE:  mObjectType = "SAMLPLE"; break;
			default: break;
		}

	}

	@Override
	public String getObjectType() {
		// TODO Auto-generated method stub
		return mObjectType;
	}

}
