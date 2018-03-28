//package com.ProjectX.ThreadManagement;
//
//import com.ProjectX.util.Logger.DebugLevel;
//import com.ProjectX.util.FileProcessor;
//import com.ProjectX.util.*;
//import com.ProjectX.util.Logger;
//import com.ProjectX.Dao.*;
//
//
//public class WorkerThread implements Runnable{
//	private FileProcessor proc; 
//	private String queryString;
//	private ConnectionManager connectionManager;
//	private Query queryType;
//	private int threadNumber;
//	
//	public static enum Query { 
//		REGISTER,
//		LOGIN,
//		SEARCH,
//		DELETE,
//		UPDATE 
//	};
//	
//	public WorkerThread(){}
//	
//	/********************************************************
//	 * 
//	 * METHOD NAME : WorkerThread
//	 * INPUT 	   : FileProcessor object, Results Object  and 
//	 * 				 IsPrime Object
//	 * RETURNS	   : CreateWorkers object
//	 * PURPOSE     : Creation of WorkerThread object and setting 
//	 * 				its member variables
//	 *
//	 ********************************************************/
//	
//	public WorkerThread(FileProcessor procIn, 
//						String queryStringIn,
//						Query queryTypeIn){
//		proc = procIn;
//		queryString = queryStringIn;
//		queryType = queryTypeIn;
//		Logger.writeMessage(" Worker Thread Created ", 
//							DebugLevel.CONSTRUCTOR);
//	}
//	
//	/********************************************************
//	 * 
//	 * METHOD NAME : WorkerThread
//	 * INPUT 	   : FileProcessor object, Results Object  and 
//	 * 				 IsPrime Object
//	 * RETURNS	   : CreateWorkers object
//	 * PURPOSE     : Creation of WorkerThread object and setting 
//	 * 				its member variables
//	 *
//	 ********************************************************/
//	
//	public WorkerThread(int threadCount, String queryStringIn, Query queryTypeIn){
//		threadNumber = threadCount;
//		queryString = queryStringIn;
//		queryType = queryTypeIn;
//		Logger.writeMessage(" Worker Thread Created ", 
//				DebugLevel.CONSTRUCTOR);
//	}
//	
//	
//	/********************************************************
//	 * 
//	 * METHOD NAME : run
//	 * INPUT 	   : void
//	 * RETURNS	   : void
//	 * PURPOSE     : executes the thread and which performs task
//	 *
//	 ********************************************************/
//
//	public void run() {
//		Logger.writeMessage(" Method run is invoked ", 
//							  DebugLevel.THREAD);
//		String line = null;
//		try {
//			//Call BusinessLogic Layer here not ConnectionManager, Business Logic should call Connection Manager internally
//			//Here user Connection manager to invoke DAO
//			switch(queryType){
//				case REGISTER: connectionManager.Register(queryString); break;
//				case LOGIN: connectionManager.Login(queryString); break;
//				case SEARCH: connectionManager.Search(queryString); break;
//				case DELETE: connectionManager.Delete(queryString); break;
//				case UPDATE: connectionManager.Update(queryString); break;
//				default: break;
//			}
//		} catch (Exception e){
//			Logger.writeMessage(" Exception worker " +e.getMessage(),
//					             DebugLevel.NONE);
//		} finally {
//			// No resources to be release 
//		}
//	}
//	
//	/********************************************************
//	 * 
//	 * METHOD NAME : toString
//	 * INPUT 	   : void
//	 * RETURNS	   : String
//	 * PURPOSE     : Stringify the data members
//	 *
//	 ********************************************************/
//	
//	public String toString(){
//		return proc.toString()/*+res.toString()+prime.toString() */ ;
//	}
//}
