package Unit5Assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
//this class will read the data.txt file
	//You should make use of a UserService class that will help with things like 
	//1. Validating if the inputed username/password matches what's in our User Array. 
	//2. It should also provide the service of reading the data from the file and 
	//3. Creating the User Array.
	//READ THE FILE AND VALIDATE USER INPUT
	
	
	public UserPOJO createUser (String username, String password, String name) {
		UserPOJO user = new UserPOJO();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	
	
	}
	
	
	
	public static void main(String[] args) {
		
		String[] information;
		
		
			try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
				String line = "";
				while((line = br.readLine()) != null){
					information = line.split(",");  
					String username = information[0];
					String password = information[1];
					String name =information[2];
//					System.out.println(username);
//					System.out.println(password);
//					System.out.println(name);
										
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
	
	}
}
