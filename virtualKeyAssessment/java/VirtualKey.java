package virtualKeyAssessment.java;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKey {
	public static File folder = new File("D:\\virtualKeyproject");

	public static void main(String[] args) {

		// printing welcome Page
	
		System.out.println("*******Welcome to Lockers Pvt. Ltd******* \n");
		features();
	}

	public static void features() {

		System.out.println(" \n ......The List of Operations are...... \n");
		String arr[] = { "1. To retrive Current file names in an ascending order",
				"2. To perform Business-level operations", "3. To Close the application" };
		
		// display all the menu mentioned in the String array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		System.out.println("\nSelect one of the options listed above\n");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		switch (n) {
		
		case 1:
			File m[] = folder.listFiles();
			Arrays.sort(m);

			for (int i = 0; i < m.length; i++)
				System.out.println(m[i]);
			features();
			break;
			
		case 2:
			boolean b = true;
			while (b) {
				System.out.println("Business Level Operations\n");
				System.out.println(" 1 : To Add a file in the existing Directory");
				System.out.println(" 2 : To Delete a file from the existing Directory. ");
				System.out.println(" 3 : To Search a user specified file from the Directory");
				System.out.println(" 4 : Back to the main menu");

				int k = sc.nextInt();
				
				switch (k) {
				
				case 1:
					System.out.println("Enter the File Name to create");
					String s = sc.next();
					File file = new File(folder, s);

					try {
						boolean value = file.createNewFile();
						if (value) {
							System.out.println("The new file is created. \n");
						} else {
							System.out.println("The file already exists.");
						}
					} catch (Exception e) {
						e.getStackTrace();
					}
					
					break;
					
				case 2:
					
					System.out.println("Enter the File Name to delete");
					String name = sc.next();
					File file1 = new File(folder, name);

					try {
						boolean value = file1.delete();
						if (value) {
							System.out.println("The new file is Deleted.");
						} else {
							System.out.println("File Not Found");
						}
					} catch (Exception e) {
						e.getStackTrace();
					}
					break;
					
				case 3:
					
					System.out.println("Enter a keyword to search");
					String search = sc.next();
					boolean flag = false;
					File arr1[] = folder.listFiles();
					System.out.println("File :\n");
					
					for (int i = 0; i < arr1.length; i++) {
						if (arr1[i].getName().startsWith(search)) {
							flag = true;
							System.out.println(arr1[i]);
						}
					}
					if (flag == false) {
						System.out.println("No file found");
					}

					break;
					
				case 4:
					
					b = false;
					features();
					break;
				default:
					System.out.println("You have made an invalid choice!");
					System.out.println("Please enter correct choice\n");

				}
			}
			break;
			
		case 3:
			System.out.println("Closing Your Application\n");
			System.out.println("Thank You");
			break;
			
		default:
			System.out.println("You have made an invalid choice!");
			System.out.println("Please enter correct choice\n");
			features();
			break;

		}
	}		


}
