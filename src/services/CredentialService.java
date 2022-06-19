package services;
import java.util.Random;

import model.Employee;

public class CredentialService {
	Employee emp;
	
	public CredentialService(Employee emp) {
		super();
		this.emp = emp;
	}

	public void generateEmail() {
		emp.setEmail(emp.getFirstName() + emp.getLastName() + "@" + emp.getDeptName() + ".abc.com");
	}
	
	public void generatePassword() {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
	    String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	    Random random = new Random();
	    char[] password = new char[8];
	    password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	    password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	    password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	    password[3] = numbers.charAt(random.nextInt(numbers.length()));
	      
	    for(int i = 4; i< 8 ; i++) {
		  password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	    }
	    emp.setPassword(password);
	}
	
	public void showCredentials() {
		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email : "+ emp.getEmail());
		System.out.println("Password : "+ new String(emp.getPassword()));
	}
}
