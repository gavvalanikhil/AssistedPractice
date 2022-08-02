package fileHandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;



public class FileHandlingProject {
	
	public static void createFileUsingNIO() throws IOException {
		
		Path path = Paths.get("C:\\Users\\HP\\Desktop\\filehandlingfile\\testfile.txt");
		//write data
		String input = "Welcome";
		byte array[] = input.getBytes();
		Files.write(path, array, StandardOpenOption.CREATE,
		StandardOpenOption.APPEND);
		System.out.println("Data is Written Successfully");
		//if you want to write data of list to files directly
		Path path1 = Paths.get("C:\\Users\\HP\\Desktop\\filehandlingfile\\testfile.txt");
		//write data using Files class
		List<String> list = Arrays.asList("\nLine1", "Line2");
		Files.write(path1, list, StandardOpenOption.CREATE,
		StandardOpenOption.APPEND);
		System.out.println("Lines are Written Successfully");
		}
		public static void main(String[] args) {
		try {
		createFileUsingNIO();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		}


