package demo1;
public class X {
	int id;
	String name;
	
	X()
	{
		
	}

	public  X(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "X [id=" + id + ", name=" + name + "]";
	}

}
