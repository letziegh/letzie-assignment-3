package Unit5Assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		
		UserService userService = new UserService();
		UserPOJO[] users = userService.InfoReader();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String userInput = scanner.nextLine();
		System.out.println("Enter your password: ");
		String password = scanner.nextLine();
		
		
		UserPOJO validatedUser = userService.validateUser(users, userInput, password);


		int attempt = 0;

		while (attempt < 4) {

			// try adding if statement to stop program from repeating welcome statement
			if (validatedUser != null) {
				System.out.println(" ");
				return;
			}
			validatedUser = userService.validateUser(users, userInput, password);
			if (validatedUser == null) {
				System.out.println("Invalid login, please try again");
				System.out.println("Enter your email: ");

				userInput = scanner.nextLine();
				System.out.println("Enter your password: ");
				password = scanner.nextLine();

			} else
				break;
			attempt++;

		}

		if (attempt == 4 && validatedUser == null) {
			System.out.println("Too many failed login attempts, you are now locked out.");
		}
		
		scanner.close();
		
		
		
		
		

		
	}
}

