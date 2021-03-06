//package com.ProjectX.ThreadManagement;
//
//import com.ProjectX.util.FileProcessor;
//import primeThreads.util.IsPrime;
//import primeThreads.store.Results;
//import com.ProjectX.ThreadManagement.WorkerThread;
//import com.ProjectX.util.Logger;
//import com.ProjectX.util.Logger.DebugLevel;
//
//public class CreateWorkers  {
//
//	private FileProcessor proc; 
//	private Results res;
//	private IsPrime prime;
//
//
//	/********************************************************
//	 * 
//	 * METHOD NAME : CreateWorkers
//	 * INPUT 	   : FileProcessor object, Results Object  
//	 * 				 and IsPrime Object
//	 * RETURNS	   : CreateWorkers object
//	 * PURPOSE     : Creation of CreateWorker object and setting 
//	 * 				 its member variables
//	 *
//	 ********************************************************/
//	
//	
//	public CreateWorkers(FileProcessor procIn,
//						 Results resIn, 
//						 IsPrime primeIn){		
//		proc = procIn;
//		res = resIn;
//		prime = primeIn;
//		Logger.writeMessage(" Created Thread Constructed ", 
//							DebugLevel.CONSTRUCTOR);
//	}
//
//	public CreateWorkers(int NUMBER_OF_THREADS){		
//			Logger.writeMessage(" Created Thread Constructed ", 
//				DebugLevel.CONSTRUCTOR);
//		}
//
//	/********************************************************
//	 * 
//	 * METHOD NAME : startWorkers
//	 * INPUT 	   : integer as the number of threads
//	 * RETURNS	   : void
//	 * PURPOSE     : Initiates the workers thread and joins it
//	 *
//	 ********************************************************/
//	
//	public void startWorkers(int NUM_THREADS){
//		Thread []workers = new Thread[NUM_THREADS];
//		try{
//			for(int threadCount = 0; 
//					threadCount <  NUM_THREADS;  
//					threadCount++) {
//				workers[threadCount] = 
//						new Thread(new WorkerThread(proc, res, prime));
//				workers[threadCount].start();
//				workers[threadCount].join();
//			}
//		} catch (Exception e){
//			Logger.writeMessage("Exception Worker "+e.getMessage(),
//				DebugLevel.NONE);
//		} finally {
//			// No resource to release
//		}
//	}
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
//		return proc.toString()+res.toString()+prime.toString() ;
//	}
//}
