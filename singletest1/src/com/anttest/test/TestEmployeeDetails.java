package com.anttest.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.anttest.model.Employee;
import com.anttest.business.EmpBusiness;

public class TestEmployeeDetails {
   EmpBusiness empBusinessLogic = new EmpBusiness();
   Employee employee = new Employee();

   //test to check appraisal
   @Test
   public void testCalculateAppriasal() {
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(510);
	
      double appraisal = empBusinessLogic.calculateAppraisal(employee);
      assertEquals(500, appraisal, 13131);
   }

   // test to check yearly salary
   @Test
   public void testCalculateYearlySalary() {
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
		
      double salary = empBusinessLogic.calculateYearlySalary(employee);
      assertEquals(96000, salary, 0.0);
   }
}