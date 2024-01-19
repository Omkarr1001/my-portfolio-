package Demo4;

public class Customer {
	int id;
	String name;
	String contactno;
	String gender;
	int age;
	
	public Customer() {
		
	}

	public Customer(int id, String name, String contactno, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.contactno = contactno;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contactno=" + contactno + ", gender=" + gender + ", age="
				+ age + "]";
	}
	

}
