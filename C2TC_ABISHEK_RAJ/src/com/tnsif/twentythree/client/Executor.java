//Program to demonstrate PreparedStatement Interface
package com.tnsif.twentythree.client;

import com.tnsif.daytwentytwo.preparedstatementinterface.PreparedStatementDemo;

public class Executor {

	public static void main(String[] args) {
		PreparedStatementDemo.showEmp();
		PreparedStatementDemo.updateEmpName(3, "Neha");
		PreparedStatementDemo.updateEmpSalary(3, 65000);
		PreparedStatementDemo.showEmp();
		if(!PreparedStatementDemo.deleteEmp(8));
			System.err.println("No such employee...");
	
		PreparedStatementDemo.showEmp();

	}

}
