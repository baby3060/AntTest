package com.anttest.main;

import com.anttest.model.*;
import com.anttest.util.*;

public class ExMain {
	public static void main(String... args) {
		int i = 1;
		i = 1;
		Employee employee = new Employee();
		employee.setAge(15);
		ObjectUtil.fixNullAndTrim(employee);
		System.out.println(employee);
	}
}