package com.ProjectX.service;

import javax.ws.rs.*;

//import com.ProjectX.ThreadManagement.*;
import com.ProjectX.*;
import com.ProjectX.OAuth2.Authentication;

import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("login")
public class Login {
//	private Thread []workers;
//	private int threadCount; // Track the number of threads
	
	// 1> Use ZooKeeper to find which of the nodes are available
	// 2> Load Balancer to check which node can handle this request
	// 3> Check for the memcache and redis implementation
	
//	Login(int NUMBER_OF_THREADS){
//		if(threadCount < NUMBER_OF_THREADS) {
//			//workers[threadCount] = new Thread(new WorkerThread(threadCount/*proc, res, prime*/));
//		}
//	}
	
//	Login(int NUMBER_OF_THREADS){
//		for(int threadCount = 0; 
//				threadCount <  NUMBER_OF_THREADS;  
//				threadCount++) {
//			if(threadCount)
//			workers[threadCount] = new Thread(new WorkerThread(/*proc, res, prime*/));
//		}
//	}
	 
	@Path("{c}")
	@GET
	@Produces("application/json")
	public Response testService(@PathParam("c") String sessionString){
		
		// TODO, Call worker thread here to call Business Logic Layer
		// Get a thread from a thread Pool
		// call execute on that threadpool with sessionString
				
		JSONObject jsonObject = new JSONObject();
		String welcomeString = "Welcome " +sessionString;
	
		Authentication userAuth =  new Authentication();	
		if(userAuth.userAuth2(sessionString)){
			jsonObject.put(welcomeString, "Welcome to the Project X login test WebService");
			
		} else {
			jsonObject.put(welcomeString, "Oh!!! Authentication Failed!!!");
			
		}
		
		String result = "@Produces(\"application/json\") Output:" + jsonObject;		
		return Response.status(200).entity(result).build();
	}
}
