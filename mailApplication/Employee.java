/**
 * 
 */
package mailApplication;

/**
 * @author Shivam Sangal
 *
 */

public class Employee {

	public static void main(String[] args) {
		CredentialService em1 = new CredentialService("Shivam", "Sangal");
		System.out.println(em1.showCredentials());
	}
}