package com.nt.dao;

import com.nt.bo.EmpBO;

public interface EmpDAOI {
	public abstract EmpBO selectEmpDetailsByEmpNo(int empNo) throws Exception;
}
