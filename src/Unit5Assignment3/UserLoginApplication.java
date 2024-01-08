package Unit5Assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		// Step 1 - watch video on ARRAY OF OBJECTS
		// Step 2 save data.txt file
		// STEP 3- create scanner
		// Step 4-validate user input against info in file

		// The rest of the logic can be held inside
		// of a UserLoginApplication Class, which houses the "public static void main"
		// method.
		UserService userService = new UserService();
		UserPOJO[] users = userService.InfoReader();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String userInput = scanner.nextLine();
		System.out.println("Enter your password: ");
		String password = scanner.nextLine();
		// String userAttempts = scanner.nextLine();

		// FINISH ADDING WHILE LOOP WITH VALIDATE USER METHOD
		//STOP LOOP FROM PRINTING WELCOME USER TWICE
		int attempt = 0;
		UserPOJO validatedUser = userService.validateUser(users, userInput, password);

		while (attempt < 4) {
			validatedUser = userService.validateUser(users, userInput, password);
			if (validatedUser == null) {
				System.out.println("Invalid login, please try again");
				System.out.println("Enter your email: ");

				userInput = scanner.nextLine();
				System.out.println("Enter your password: ");
				password = scanner.nextLine();

			} else break;
//				System.out.println("Welcome:" + currentUser.getName());
				
			attempt++;

		}
		
		if(attempt==4 && validatedUser == null){
		System.out.println("Too many failed login attempts, you are now locked out.");
		}
		// add while loop here then move it into userservice later
		// user validate user method in while loop
		// add user input back to be read by scanner like assignment 2
		// you dont have to add another scanner in, reuse scanner in main method

		// STORE INTO AN ARRAY OF USERS//FINISH WATCHING ARRAYS PART 2 to complete
		// storing users into array
//		user[0] = userService.createUser("test@email.com","passwordTest!1", "Test User");
//		user[1] = userService.createUser("another@user.com","asdfasdf","Another User");
//		user[2] = userService.createUser("john.doe@mydomain.net","Hdk398jf!","John Doe");
//		user[3] = userService.createUser("jane.doe@myotherdomain.com","sunrise-sunset","Jane Doe");

		scanner.close();

	}

}
