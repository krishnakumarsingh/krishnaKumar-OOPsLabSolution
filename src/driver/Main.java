package driver;
import java.util.Scanner;
import model.Employee;
import services.GenerateCredentials;

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
		GenerateCredentials generateCred = new GenerateCredentials(emp);
		
		switch(deprtType) {
			case 1:
				emp.setDeptName("tech");
				break;
			case 2:
				emp.setDeptName("admin");
				break;
			case 3:
				emp.setDeptName("hr");
				break;
			case 4:
				emp.setDeptName("legal");
				break;
			default:
				System.out.println("Not found");
		}
		generateCred.generateEmail();
		generateCred.generatePassword();
		generateCred.showCredentials();
	}

}
