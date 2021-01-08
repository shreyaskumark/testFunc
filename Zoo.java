package Exercise19;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int z_count=0;
System.out.print("Enter the max_limit:");
int max=sc.nextInt();
ZooDetail z;
ZooDetail zoo[]=new ZooDetail[max];
for(;;) {
System.out.println("\n1.Enter the Details\n"
		+ "2.Update Zoo Detail\n"
		+ "3.Delete Zoo Detail\n"
		+ "4.Display\n"
		+ "5.Exit");
System.out.print("Enter your Choice:");
int ch=sc.nextInt();
switch(ch) {
case 1:IdValidate obj=new IdValidate();
Validate ob=new Validate();
	int id=obj.id(zoo, z_count);
	String location=ob.location();
	String name=ob.name();
	System.out.print("Enter cage no:");
	String cage_no=sc.next();
	 //z=new ZooDetail(id,location,name);
       z=new ZooDetail(id,location,name,cage_no);
	//z.setId(id);
	//z.setName(name);
	//z.setLocation(location);
	//z.setCage(cage_no);
      
  	zoo[z_count]=z;
	z_count++;
	break;
case 2:if(z_count>0) {
	Scanner ss=new Scanner(System.in);
	System.out.print("Enter the ID you wanna update:");
int id_update=sc.nextInt();
int count=0;
for(int i=0;i<z_count;i++) {
	if(zoo[i].getId()==(id_update)) {
		count++;
		System.out.print("Enter the cage no:");
		String cage_update=ss.next();
		zoo[i].setCage(cage_update);
		System.out.println("Updated Successfully!!");	
	}
	}
if(count==0){
	System.out.println("ID was not found!!");
}
}else if(z_count==0){
	System.out.println("Empty Records!!");
}
	break;
case 3:if(z_count>0) {
	System.out.print("Enter the ID you wanna delete:");
int delete_id=sc.nextInt();
int count=0;
for(int i=0;i<z_count;i++) {
	if(zoo[i].getId()==(delete_id)) {
		count++;
		if(i==(z_count-1)) {
			z_count--;
		}
		else {
			for(int j=i;j<z_count-1;j++) {
				ZooDetail temp=zoo[i];
				zoo[i]=zoo[i+1];
				zoo[i+1]=temp;
			}
			z_count--;
		}
		System.out.println("Deleted Successfully!!");	
	}
	}
if(count==0) {
	System.out.println("ID was not found!!");
}
}else {
	System.out.println("Empty Records!!");
}
	break;
case 4:System.out.println("\n1.Display All Details\n"
		+ "2.Sorted based on ID\n"
		+ "3.Sort Based on Location(if location is same sort by name)");
System.out.print("Enter your choice:");
int choice=sc.nextInt();
switch(choice) {
case 1:System.out.println("ID\t"+"Name\t"+"Cage No.\t"+"Location\t");
	for(int i=0;i<z_count;i++) {
	System.out.println(zoo[i].getId()+"\t"+zoo[i].getName()+"\t"+zoo[i].getCage()+"\t"+
			zoo[i].getLocation());
	
}
	break;
case 2:for(int i=0;i<z_count;i++) {
	  for(int j=0; j < (z_count-i-1); j++){  
          if(zoo[j].getId() > zoo[j+1].getId()){  
                 //swap elements  
                ZooDetail temp = zoo[j];  
                 zoo[j] = zoo[j+1];  
                 zoo[j+1] = temp;  
         }           
 }  
}
System.out.println("ID\t"+"Name\t"+"Cage No.\t"+"Location\t");
for(int i=0;i<z_count;i++) {
System.out.println(zoo[i].getId()+"\t"+zoo[i].getName()+"\t"+zoo[i].getCage()+"\t"+
		zoo[i].getLocation());

}
	break;
case 3:for(int i=0;i<z_count;i++) {
	  for(int j=0; j < (z_count-i-1); j++){  
          if(zoo[j].getLocation().compareTo(zoo[j+1].getLocation())>0){  
                 //swap elements  
                ZooDetail temp = zoo[j];  
                 zoo[j] = zoo[j+1];  
                 zoo[j+1] = temp;  
         }else if(zoo[j].getLocation().compareTo(zoo[j+1].getLocation())==0) {
        	 if(zoo[j].getName().compareTo(zoo[j+1].getName())>0) {
        		 ZooDetail temp = zoo[j];  
                 zoo[j] = zoo[j+1];  
                 zoo[j+1] = temp;  
        	 }
         }
 } 
	  }
System.out.println("ID\t"+"Name\t"+"Cage No.\t"+"Location\t");
for(int i=0;i<z_count;i++) {
System.out.println(zoo[i].getId()+"\t"+zoo[i].getName()+"\t"+zoo[i].getCage()+"\t"+
		zoo[i].getLocation());

}
break;
}
	break;
case 5:return;
default:System.out.println("INVALID choice!!");
	break;

}
	}
	}
}
