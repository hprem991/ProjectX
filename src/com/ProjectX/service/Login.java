package com.ProjectX.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/Login")
public class Login {
	@Path("{c}")
	@GET
	@Produces("application/json")
	public Response testService(@PathParam("c") String sessionString){
		
		// Get a thread from a thread Pool
		// call execute on that threadpool with sessionString
		
		JSONObject jsonObject = new JSONObject();
		String welcomeString = "Welcome " +sessionString;
		jsonObject.put(welcomeString, "Welcome to the Project X test WebService");
		
		String result = "@Produces(\"application/json\") Output:" + jsonObject;		
		return Response.status(200).entity(result).build();
	}
}
