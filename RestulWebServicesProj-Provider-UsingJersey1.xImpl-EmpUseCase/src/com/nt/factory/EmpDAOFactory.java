package com.nt.factory;

import com.nt.dao.EmpDAOI;
import com.nt.dao.EmpDAOImpl;

public class EmpDAOFactory {
	private static EmpDAOI dao;
	
	static{
		dao=new EmpDAOImpl();
	}
	
	public static EmpDAOI getEmpDAOImplInstance(){
		return dao;
	}
}
