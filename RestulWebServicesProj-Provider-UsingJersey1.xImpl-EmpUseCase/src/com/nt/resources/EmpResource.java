package com.nt.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nt.factory.EmpServiceFactory;
import com.nt.services.EmpServiceI;

@Path("/emp")
public class EmpResource {

	@Path("/getEmpInfoByGivenEmpNo")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getEmpInfoByGivenEmpNo(@DefaultValue("102") @QueryParam("empNo") Integer no) throws Exception{
		//create EmpServiceImpl class Object
		//EmpServiceI service=new EmpServiceImpl();
		EmpServiceI service=EmpServiceFactory.getEmpServiceImplInstance();
		
		//call EmpServiceImpl class method to get employee Info As JSON Object By Giving EmpNo and return to client
		return service.getEmpDetailsByGivenEmpNo(no);
	}
	
	@Path("/getEmpInfoByGivenEmpNoAsPathParam/{empNo}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getEmpInfoByGivenEmpNoAsPathParam(@DefaultValue("102") @PathParam("empNo") Integer no) throws Exception{
		//create EmpServiceImpl class Object
		//EmpServiceI service=new EmpServiceImpl();
		EmpServiceI service=EmpServiceFactory.getEmpServiceImplInstance();
		
		//call EmpServiceImpl class method to get employee Info As JSON Object By Giving EmpNo and return to client
		return service.getEmpDetailsByGivenEmpNo(no);
	}
	
	@Path("/getEmpInfoByGivenEmpNoAsMatrixParam")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getEmpInfoByGivenEmpNoAsMatrixParam(@DefaultValue("102") @MatrixParam("empNo") Integer no) throws Exception{
		//create EmpServiceImpl class Object
		//EmpServiceI service=new EmpServiceImpl();
		EmpServiceI service=EmpServiceFactory.getEmpServiceImplInstance();
		
		//call EmpServiceImpl class method to get employee Info As JSON Object By Giving EmpNo and return to client
		return service.getEmpDetailsByGivenEmpNo(no);
	}

}
