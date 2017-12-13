package com.nt.util;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONUtil {
	private static ObjectMapper objectMapper;
	
	static{
		objectMapper=new ObjectMapper();
	}
	
	public static String javaToJson(Object obj) throws IOException{
		
		return objectMapper.writeValueAsString(obj);
	}
	
	/*public static Object jsonToJava(String s,Class clazz) throws JsonParseException, JsonMappingException, IOException{
		return objectMapper.readValue(s, clazz);
		
	}*/
	
	public static <T>T jsonToJava1(String s,Class<T> clazz) throws JsonParseException, JsonMappingException, IOException{
		return objectMapper.readValue(s, clazz);
		
	}
}
