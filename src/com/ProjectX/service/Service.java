package com.ProjectX.service;


import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.json.JSONObject;
//import com.ProjectX.Dao.ConnectionManager;
//import com.ProjectX.BussinessLogic.*;

import com.ProjectX.Bussiness.BussinessLogic;

@Path("service")
public class Service {	
	
	private BussinessLogic logic; 
	
	Service(){
		logic = new BussinessLogic();
	}
//	@Path("{c}")
//	@GET
//	@Produces("application/json")
//	public Response testService(@PathParam("c") String c){
//		JSONObject jsonObject = new JSONObject();
//		String welcomeString = "Welcome " +c;
//		jsonObject.put(welcomeString, "Welcome to the Project X test WebService");
//		
//		String result = "@Produces(\"application/json\") Output:" + jsonObject;		
//		return Response.status(200).entity(result).build();
//	}
	
	@Path("{c}")
	@GET
	@Produces("application/json")
	public Response serve(@PathParam("c") String c){
//		Thread logic = new Thread(new BussinessLogic(c));
//		logic.start();
//		logic.join();	

		
		
		ArrayList<String> res = logic.searchArea(c);
		
		JSONObject jsonObject = new JSONObject();
		String welcomeString = "Welcome " +c;
		jsonObject.put(welcomeString, "Welcome to the Project X test WebService");
		
		for(int i=0; i < res.size(); i++){
			welcomeString += res.get(i) + i;
		}
		
		String result = "@Produces(\"application/json\") Output:" + jsonObject;		
		return Response.status(200).entity(result).build();
	}
}
