package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nt.bo.EmpBO;
import com.nt.constants.DAOQueryConstants;
import com.nt.factory.ConnectionFactory;

public class EmpDAOImpl implements EmpDAOI{
	
	/*
	@Override
	public EmpBO selectEmpDetailsByEmpNo(int empNo) throws Exception {
		EmpBO bo=null;
		
		//Load And Register The Driver(Oracle Type-4 driver)
		//We Have To Know Driver Class Name,url,userName and Password
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Establish The Connection By Creating The Connection Object
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");

		//create preparedStatement Object
		PreparedStatement ps=con.prepareStatement("select empno,ename,job,sal,sex,addrs,mobileno from emp143 where empno=?");
		ps.setInt(1, empNo);
		
		//send and execute the sql query
		ResultSet rs=ps.executeQuery();
		
		//process The ResultSet
		if(rs.next()){
			bo=new EmpBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getFloat(4));
			bo.setSex(rs.getString(5));
			bo.setAddrs(rs.getString(6));
			bo.setMobileNo(rs.getString(7));
		}
		
		return bo;
	}
	*/
	
	
	@Override
	public EmpBO selectEmpDetailsByEmpNo(int empNo) throws Exception {
		EmpBO bo=null;
		
		//Establish The Connection By Creating Connection Object By Using Factory Method
		Connection con=ConnectionFactory.getConnection();
		
		//create preparedStatement Object
		PreparedStatement ps=con.prepareStatement(DAOQueryConstants.GET_EMP_DETAILS_BY_NO_QUERY);
		ps.setInt(1, empNo);
		
		//send and execute the sql query
		ResultSet rs=ps.executeQuery();
		
		//process The ResultSet
		if(rs.next()){
			bo=new EmpBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getFloat(4));
			bo.setSex(rs.getString(5));
			bo.setAddrs(rs.getString(6));
			bo.setMobileNo(rs.getString(7));
		}
		
		return bo;
	}
	
}
