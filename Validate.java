package Exercise19;

import java.util.Scanner;

public class Validate {
	
	public String name() {
		Scanner s1=new Scanner(System.in);
		String name;
		do {
			System.out.print("Enter the Zoo Name:");
			name=s1.nextLine();
			if(name.length()!=0 || name=="" ||name != null) {
				return name;
			}
		}while(true);
	}
	
	String location() {
		Scanner s1=new Scanner(System.in);
		String name;
		do {
			System.out.print("Enter the location:");
			name=s1.nextLine();
			if(name.length()!=0 || name=="" ||name != null) {
				return name;
			}
		}while(true);
	}
}
