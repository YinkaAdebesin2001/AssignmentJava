package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {
	
	String switcher;
	
	Scanner scan1, scan2, scan3, scan4, scan5;
	
	public File F1 = new File("Cars.txt");
	public File F2 = new File("Countries.txt");
	public File F3 = new File("Food.txt");
	public File F4 = new File("Subjects.txt");
	public File F5 = new File("Brands.txt");
	
	public FileProcessor() {
		
		try {
			scan1 = new Scanner(F1);
			scan1.useDelimiter(":");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			scan2 = new Scanner(F2);
			scan2.useDelimiter(":");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			scan3 = new Scanner(F3);
			scan3.useDelimiter(":");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			scan4 = new Scanner(F4);
			scan4.useDelimiter(":");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			scan5 = new Scanner(F5);
			scan5.useDelimiter(":");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}