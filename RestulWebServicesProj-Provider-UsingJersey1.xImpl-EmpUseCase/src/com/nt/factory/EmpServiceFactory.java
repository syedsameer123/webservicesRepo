package com.nt.factory;

import com.nt.services.EmpServiceI;
import com.nt.services.EmpServiceImpl;

public class EmpServiceFactory {
	private static EmpServiceI service;

	static {
		service = new EmpServiceImpl();
	}

	public static EmpServiceI getEmpServiceImplInstance() {
		return service;
	}
}
