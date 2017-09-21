package com.ProjectX.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/Service")
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
}
