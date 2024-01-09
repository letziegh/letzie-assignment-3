package Unit5Assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Arrays;
//import java.util.Scanner;

public class UserService {
//this class will read the data.txt file
	// You should make use of a UserService class that will help with things like
	// 1. Validating if the inputed username/password matches what's in our User
	// Array.
	// 2. It should also provide the service of reading the data from the file and
	// 3. Creating the User Array.
	// READ THE FILE AND VALIDATE USER INPUT

	public UserPOJO validateUser(UserPOJO[] user, String username, String password) {
//change from void to UserPOJO return something
		

		for (int i = 0; i < user.length; i++) {
			UserPOJO currentUser = user[i];

			if (currentUser.getUsername().equalsIgnoreCase(username) && currentUser.getPassword().equals(password)) {
				System.out.println("Welcome:" + currentUser.getName());
				return currentUser;
			}
			

			

		} return null;
		
		
	}

	public UserPOJO createUser(String username, String password, String name) {
		UserPOJO user = new UserPOJO();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;

	}

	public UserPOJO[] InfoReader() {
		UserService userService = new UserService();
		UserPOJO[] users = new UserPOJO[4];

//insert 4 different users into array
// rewatch videos on arrays
		String[] information;
		int i = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			String line = "";
			while ((line = br.readLine()) != null) {
				information = line.split(",");
				String username = information[0];
				String password = information[1];
				String name = information[2];
				UserPOJO newuser = userService.createUser(username, password, name);
				// System.out.println(newuser);
				users[i] = newuser;
				i++;
			}
		//	System.out.println(Arrays.toString(users));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return users;
	}
}

//public void validateUser(UserPOJO[] user, String username, String password) {
//	for (int i = 0; i < user.length; i++) {
//		UserPOJO currentUser = user[i];
//		
//		if (currentUser.getUsername().equalsIgnoreCase(username) && currentUser.getPassword().equals(password)) {
//			System.out.println("Welcome: " + currentUser.getName());
//			break;
//		}else if(!currentUser.getUsername().equalsIgnoreCase(username) || (!currentUser.getPassword().equals(password))){
//			System.out.println("Invalid login, please try again.");
//			continue;
//					
//		}else {
//			System.out.println("Too many failed login attempts, you are now locked out.");
//		}return;
//				
//	}
//}