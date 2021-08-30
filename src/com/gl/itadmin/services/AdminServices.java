package com.gl.itadmin.services;

/**
 * @author Shivam Sangal
 * Lab 1 - Mail Application 
 *
 */

import com.gl.itadmin.bean.ItAdminBean;
import java.util.Scanner;

public class AdminServices {

	private String pass;
	private String dept;

	/**
	 * Generates the Email Address of the new hires
	 * 
	 * @method generateEmailAddress
	 * @param none
	 * @return email address of the new hire
	 */
	private String generateEmailAddress(ItAdminBean newuser) {
		this.dept = setDepartment();
		this.pass = generatePassword(10);
		return newuser.getfName().toLowerCase() + newuser.getlName().toLowerCase() + "@" + dept + "." + "company.com";
	}

	/**
	 * Sets the department of the new hires
	 * 
	 * @method setDepartment
	 * @param none
	 * @return department number of the new hire
	 */
	private String setDepartment() {
		System.out.print("Please enter the department from the following "
				+ "\n1. Technical\n2. Admin\n3. Human Resource\n4 Legal\n");
		Scanner in = new Scanner(System.in);
		int selectedDep = in.nextInt();
		if (selectedDep == 1) {
			return "technical";
		} else if (selectedDep == 2) {
			return "admin";
		} else if (selectedDep == 3) {
			return "humanresource";
		} else if (selectedDep == 4) {
			return "legal";
		} else {
			return "";
		}
	}

	/**
	 * Generates the password of the new hire
	 * 
	 * @method generatePassword
	 * @param none
	 * @return generates the password of the new hire
	 */
	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}

	/**
	 * Displays the credentials of the new hire
	 * 
	 * @method showCredentials
	 * @param none
	 * @return credentials
	 */
	public String showCredentials(ItAdminBean newuser) {
		return "Dear " + newuser.getfName() + "  your generated credentials are as follow" + "\nEmail --> "
				+ this.generateEmailAddress(newuser) + "\nPassword --> " + this.pass;
	}
}
