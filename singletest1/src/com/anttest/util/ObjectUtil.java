package com.anttest.util;

import com.anttest.model.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.*;

/**
 * 공통 Util Class 입니다.
 */
public class ObjectUtil {
	public static void fixNullAndTrim(Object obj) {
		Class newCls = obj.getClass();
		String clsName = newCls.getName();
		
		try {
			Class<?> cls = Class.forName(clsName);
			Object newObj = cls.newInstance();
			ModelInterface model = (ModelInterface)newObj;
			
			// Field[] flds = cls.getDeclaredFields();
			Method[] methods = cls.getDeclaredMethods();
			
			// List<Field> fldList = new ArrayList<Field>(Arrays.asList(flds));
			List<Method> methList = new ArrayList<Method>(Arrays.asList(methods));
			
			// 람다는 값 할당이 안 되므로,
			/*
			fldList.forEach( k -> {
				
			});
			*/
			
			// SetMethod 저장 메소드 변수
			Method runMethod = null;

			// setMethod 찾을 때 사용			
			String field = "";
			
			// Get Method Return Type
			Class<?> rType = null;
			
			// Null Field가 String일 경우
			String null_str = "";
			
			for(Method method : methList) {
				if( method.getName().startsWith("get") ) {
					field = method.getName().substring(3);
					
					rType = method.getReturnType();
					
					if(method.invoke(obj) == null) { 
						if(rType == String.class) {
							runMethod = cls.getMethod("set" + field, String.class);
							runMethod.invoke(obj, null_str);
						}
					}
				}
			}
			
		} catch(RuntimeException rte) {
			rte.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}