package Exercise19;

public class ZooDetail {
private int id;
private String cage_no;
private String name;
private String location;
public ZooDetail(String c) {
	cage_no=c;
}
 	public ZooDetail(int id,String l,String n,String c) {
 		this("1");
 		this.setId(id);
 		if(c.length()!=0)
 		this.setCage(c);
 		this.setLocation(l);
 		this.setName(n);
 	}
 	
public void setId(int id) {
	this.id=id;
}public int getId() {
	return id;
}
public void setCage(String cage_update) {
	this.cage_no=cage_update;
}public String getCage() {
	return cage_no;
}
public void setName(String n) {
	this.name=n;
}public String getName() {
	return name;
}
public void setLocation(String l) {
	this.location=l;
}public String getLocation() {
	return location;
}
}
