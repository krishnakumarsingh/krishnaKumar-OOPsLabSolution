package driver;
import java.util.Scanner;
import model.Employee;
import model.GenerateCredentials;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please enter the department from the following ");
		System.out.print(
			"1. Technical" + "\n" + 
			"2. Admin" + "\n" + 
			"3. Human Resource" + "\n" + 
			"4. Legal" + "\n"
		);
		Scanner scan = new Scanner(System.in);
		int deprtType = scan.nextInt();
		Employee emp = new Employee("Krishna", "Kumar");
		GenerateCredentials generateCred = new GenerateCredentials();
		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
	
		switch(deprtType) {
			case 1:
				System.out.println("Email : " + generateCred.generateEmail(emp.getFirstName(), emp.getLastName(), "tech"));
				System.out.println("Password : " + String.valueOf(generateCred.generatePassword()));
				break;
			case 2:
				System.out.println("Email : " + generateCred.generateEmail(emp.getFirstName(), emp.getLastName(), "admin"));
				System.out.println("Password : " + String.valueOf(generateCred.generatePassword()));
				break;
			case 3:
				System.out.println("Email : " + generateCred.generateEmail(emp.getFirstName(), emp.getLastName(), "hr"));
				System.out.println("Password : " + String.valueOf(generateCred.generatePassword()));
				break;
			case 4:
				System.out.println("Email : " + generateCred.generateEmail(emp.getFirstName(), emp.getLastName(), "legal"));
				System.out.println("Password : " + String.valueOf(generateCred.generatePassword()));
				break;
			default:
				System.out.println("Not found");
		}
	}

}
