package demo1;

public class Employe {
 int id;
 float salary;
 String name;
 String role;







public Employe() {
	super();
	
}


public Employe(int id, float salary, String name, String role) {
	super();
	this.id = id;
	this.salary = salary;
	this.name = name;
	this.role = role;
}


@Override
public String toString() {
	return "Collection1 [id=" + id + ", salary=" + salary + ", name=" + name + ", role=" + role + "]";
}




}
