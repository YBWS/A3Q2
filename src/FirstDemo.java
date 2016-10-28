import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
public class FirstDemo {

	/**
	 * @param args
	 */
	/**

	 *

	 * Name: Bowen Yang

	 * Teacher: Mr.Hardman

	 * Assignment #3, Program #2

	 * Date Last Modified: Oct.26

	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput=new Scanner(System.in);
		String firstname;
		String lastname;
	    int grade;
		Double studentID;
		String login;
		String schoolaverage;

		
		System.out.println("Hello User!");
		
		System.out.print("what is your first name?");
		firstname=userInput.nextLine();
		
		System.out.print("what is your last name?");
		lastname=userInput.nextLine();
		
		System.out.print("What is your grade?");
		grade=userInput.nextInt();
		
		System.out.print("What is your student ID?");
		studentID=userInput.nextDouble();
		
		System.out.print("What is your login?");
		login=userInput.next();
		
		System.out.print("What is school average?");
		schoolaverage=userInput.next();
		

		System.out.println("\n"+"Your name is: "+firstname+lastname);
		System.out.println("\n"+"Grade(9-12): "+grade);
		System.out.println("\n"+"Student ID: "+studentID);
		System.out.println("\n"+"Login: "+login);
		System.out.println("\n"+"School Average: "+schoolaverage+"%");

	    userInput.close();
	

	}

}
