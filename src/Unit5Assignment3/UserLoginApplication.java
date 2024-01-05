package Unit5Assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		// Step 1 - watch video on ARRAY OF OBJECTS 
		//Step 2 save data.txt file
		//STEP 3- create scanner
		//Step 4-validate user input against info in file
		
		
		//The rest of the logic can be held inside 
		//of a UserLoginApplication Class, which houses the "public static void main" method.
		UserService userService = new UserService();
		UserPOJO [] users = userService.InfoReader();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String userInput = scanner.nextLine();		
		System.out.println("Enter your password: ");
		String password = scanner.nextLine();
		
		
		
		
		 userService.validateUser(users, userInput, password);
		
		//STORE INTO AN ARRAY OF USERS//FINISH WATCHING ARRAYS PART 2 to complete storing users into array
//		user[0] = userService.createUser("test@email.com","passwordTest!1", "Test User");
//		user[1] = userService.createUser("another@user.com","asdfasdf","Another User");
//		user[2] = userService.createUser("john.doe@mydomain.net","Hdk398jf!","John Doe");
//		user[3] = userService.createUser("jane.doe@myotherdomain.com","sunrise-sunset","Jane Doe");
		
		
		
	
		scanner.close();
		
	}

}
