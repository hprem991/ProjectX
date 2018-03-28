package com.ProjectX.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.json.JSONObject;
//import com.ProjectX.Dao.ConnectionManager;
//import com.ProjectX.BussinessLogic.*;

@Path("service")
public class Service {	
	@Path("{c}")
	@GET
	@Produces("application/json")
	public Response testService(@PathParam("c") String c){
		JSONObject jsonObject = new JSONObject();
		String welcomeString = "Welcome " +c;
		jsonObject.put(welcomeString, "Welcome to the Project X test WebService");
		
		String result = "@Produces(\"application/json\") Output:" + jsonObject;		
		return Response.status(200).entity(result).build();
	}
	
//	@Path("{c}")
//	@GET
//	@Produces("application/json")
//	public Response testThreadedService(@PathParam("c") String c){
//		Thread logic = new Thread(new BussinessLogic(c));
//		logic.start();
//		logic.join();
//		
//		BussinessLogic logic = new BussinessLogic();
//		JSONObject jsonObject = new JSONObject();
//		String welcomeString = "Welcome " +c;
//		jsonObject.put(welcomeString, "Welcome to the Project X test WebService");
//		
//		String result = "@Produces(\"application/json\") Output:" + jsonObject;		
//		return Response.status(200).entity(result).build();
//	}
}
