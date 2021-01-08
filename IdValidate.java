package Exercise19;

import java.util.Scanner;

import Exercise20.StudentDetail;

public class IdValidate {
	
	int id(ZooDetail st_array[],int z_count) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id:");
		int id;
		do {
			id=sc.nextInt();

			if(z_count==0) {
				if (id>0 && id<100) {
					return id;
				}}
			else {
				if(id>0 && id<100) {
					int check_id=0;
					for(int i=0;i<z_count;i++) {
						if(st_array[i].getId()==id) {
							check_id++;
						}
					}if(check_id==0) {
						return id;
					}}
			}
			System.out.println("ID is already present!");
			System.out.print("Enter ID:");
		}while(true);
	}
}
