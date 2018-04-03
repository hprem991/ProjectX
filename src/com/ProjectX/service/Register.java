package com.ProjectX.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

@Path("register")
public class Register {
	@Path("{c}")
	@GET
	@Produces("application/json")
	public Response registerService(@PathParam("c") String sessionString){
		JSONObject jsonObject = new JSONObject();
		String welcomeString = "Welcome " +sessionString;
		
		
	
		
		String result = "@Produces(\"application/json\") Output:" + jsonObject;		
		return Response.status(200).entity(result).build();
	}
}
