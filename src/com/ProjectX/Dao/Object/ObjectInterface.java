package com.ProjectX.Dao.Object;

public interface ObjectInterface {
	
	public enum ObjectType { 
		SAMPLE,
		REGISTER,
		LOGIN,
		SEARCH,
		DELETE,
		UPDATE 
	};
	
	public void setObjectType(ObjectType aObjectType);
	public String getObjectType();
}
