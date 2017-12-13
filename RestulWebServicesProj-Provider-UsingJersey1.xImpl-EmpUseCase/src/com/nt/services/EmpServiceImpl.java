package com.nt.services;

import com.nt.bo.EmpBO;
import com.nt.constants.StatusConstants;
import com.nt.dao.EmpDAOI;
import com.nt.dao.EmpDAOImpl;
import com.nt.dto.ResponseDTO;
import com.nt.factory.EmpDAOFactory;
import com.nt.util.JSONUtil;

public class EmpServiceImpl implements EmpServiceI{

	@Override
	public String getEmpDetailsByGivenEmpNo(int empNo) throws Exception {
		//create EmpDAOImpl class object
		//EmpDAOI dao=new EmpDAOImpl();
		EmpDAOI dao=EmpDAOFactory.getEmpDAOImplInstance();
		
		//call EmpDAOImpl class method to get employee Info As Java Object By Giving EmpNo
		EmpBO bo =dao.selectEmpDetailsByEmpNo(empNo);
		
		ResponseDTO dto=new ResponseDTO();
		if(bo!=null){
			dto.setStatus(StatusConstants.SUCCESS_RESPONSE);
			dto.setMsg("Successfully Retrived Employee Info For Given EmoNo "+empNo);
			dto.setData(JSONUtil.javaToJson(bo));
		}else{
			dto.setStatus(StatusConstants.FAILURE_RESPONSE);
			dto.setMsg("Not Successfully Retrived Employee Info For Given EmoNo "+empNo);
			dto.setData(null);
		}
		return JSONUtil.javaToJson(dto);
	}

}
