/**
 * 
 */
package com.gl.itadmin.demo;

import com.gl.itadmin.bean.ItAdminBean;
import com.gl.itadmin.services.AdminServices;
import java.util.Scanner;

/**
 * @author Shivam Sangal
 *
 */

public class EmployeeAdmin {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Fisrt Name");
		String firstName = scr.next();
		System.out.println("Enter Last Name");
		String lastName = scr.next();
		AdminServices service = new AdminServices();
		ItAdminBean newuser = new ItAdminBean();
		newuser.setfName(firstName);
		newuser.setLName(lastName);
		System.out.println(service.showCredentials(newuser));
	}
}