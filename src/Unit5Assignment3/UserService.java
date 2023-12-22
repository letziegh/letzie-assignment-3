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
	
	public static void main(String[] args) {
		
		
		String line = "";
		
			try {
				BufferedReader br = new BufferedReader(new FileReader("data.txt"));
				while((line = br.readLine()) != null){
					String[] userStuff = line.split(",");
					System.out.println(userStuff);
					for(String userInfo : userStuff);
					System.out.println(userInfo);
					
					
				}
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}catch (IOException e) {
				
				e.printStackTrace();
			}
		//put back what you had before in run configurations
			//split each line into an array
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//try {
//			BufferedReader fileReader = null;
//			 fileReader = new BufferedReader(new FileReader("data.txt"));
//			
//			
//			 while((line = fileReader.readLine())  != null) {
//				 String[] userInfo = line.split(",");
//			 System.out.println(userInfo);
//			 }
//			 
//		} catch (FileNotFoundException e) {
//			System.out.println("Oops there was an exception");
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				
//				System.out.println("Closing file reader");
//				fileReader.close();
//			}catch (IOException e) {
//				e.printStackTrace();
//		}
//		}
////		for (String arg : args) {
//////			System.out.println(arg);
////			String []userArray = arg.split(",");
////			for (String userInfo : userArray) {
////				System.out.println(userInfo);
////			}
//		}
//		
//				
	}
}
