package com.bl.empwagecom;

public class EmpWageCalculationUC8 {

	public static void main(String[] args) {
		EmpWageUC8 dmartEmp = new EmpWageUC8("DMart", "John", 8, 20, 20, 60);
		int dmartEmpWage = dmartEmp.calculateEmpWage();

		System.out.println(dmartEmp.empName + " is Working With " + dmartEmp.companyName + ", and He Is Earning = "
				+ dmartEmpWage + " $ Monthly");

		EmpWageUC8 rILEmp = new EmpWageUC8("Reliance", "Tony", 9, 15, 25, 80);
		int rILEmpWage = rILEmp.calculateEmpWage();
		System.out.println(rILEmp.empName + " is Working With " + rILEmp.companyName + ", and He Is Earning = "
				+ rILEmpWage + " $ Monthly");
		
		EmpWageUC8 Emp1 = new EmpWageUC8("Wipro", "Rahul", 9, 15, 25, 80);
		int result1 = rILEmp.calculateEmpWage();
		System.out.println(Emp1.empName + " is Working With " + Emp1.companyName + ", and He Is Earning = "
				+ result1 + " $ Monthly");
	}
}
