package Unit5Assignment3;

public class UserLoginApplication {

	public static void main(String[] args) {
		// Step 1 - watch video on ARRAY OF OBJECTS 
		//Step 2 save data.txt file
		//STEP 3- create scanner
		//Step 4-validate user input against info in file
		
		
		//The rest of the logic can be held inside 
		//of a UserLoginApplication Class, which houses the "public static void main" method.
		
		
		
		
		UserService userService = new UserService();
		
		UserPOJO[] user = new UserPOJO[4];
		
		
		//STORE INTO AN ARRAY OF USERS//FINISH WATCHING ARRAYS PART 2 to complete storing users into array
		user[1] = userService.createUser("test@email.com","passwordTest!1", "Test User");
		user[2] = userService.createUser("another@user.com","asdfasdf","Another User");
		user[3] = userService.createUser("john.doe@mydomain.net","Hdk398jf!","John Doe");
		user[4] = userService.createUser("jane.doe@myotherdomain.com","sunrise-sunset","Jane Doe");
		
		//UserPOJO anyUser1 = new UserPOJO(); DONE/COMPLETED
//		 System.out.println(user1);
//		 System.out.println(user2);
//		 System.out.println(user3);
//		 System.out.println(user4);

	}

}
