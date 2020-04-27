import java.util.Scanner;

/*
 * 
 * Lab 7 Starter Project
 * 
 * 
 */

public class Lab7Regex {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();
		
		validateName(name);
		
		
		System.out.print("Please enter a valid Email: ");
		String email = scnr.nextLine();
		
		validateEmail(email);
		
		
		System.out.print("Please enter a valid Phone #: (###-###-####)");
		String phone = scnr.nextLine();
		
		validatePhone(phone);
		
		System.out.print("Please enter a valid Date: (mm/dd/yyyy)");
		String date = scnr.nextLine();
		
		validateDate(date);
		
		System.out.print("Please enter a valid HTML: ");
		String html = scnr.nextLine();
		
		validateHTML(html);
		
	}

	public static boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Z][a-z]{1,29}"; //https://regexr.com/  RegExr is an online tool to learn, build, & test Regular Expressions (RegEx / RegExp).

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}

	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = "[a-zA-Z\\d]{5,30}[@][a-zA-Z\\d]{3,10}[.][a-zA-Z\\d]{2,3}";//no special characters

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}
	
	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		String regex = "\\d{3}[-]\\d{3}[-]\\d{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}
	
	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "\\d\\d[/]\\d\\d[/]\\d{4}";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}
	
	public static boolean validateHTML(String html) {  //created HTMLelements to test for <p></p>,<h1></h1>,<div></div>,
		
		String regex = "[<][\\w\\d]{1,3}[>][\\w\\d\\s\\.\\,\\;\\:\\!\\?\\\"]+[<][/][\\w\\d]{1,3}[>]";
		
		if(html.matches(regex)) {
			System.out.println("HTML is valid!");
			return true;
		} else {
		    System.out.println("Sorry, date is not valid!");
		    return false;
	    }
    }
}
