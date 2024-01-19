package Demo2;

public class Employe {
int id;
String name;
float salary;
String role;
public Employe() {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.role = role;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
}
}
