package Demo4;

public class Bus {
	int id;
	String platno;
	String description;
	int capacity;
	
	
	
	public  Bus()
	{
		
	}
	public Bus(int id, String platno, String description, int capacity) {
		super();
		this.id = id;
		this.platno = platno;
		this.description = description;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", platno=" + platno + ", description=" + description + ", capacity=" + capacity + "]";
	}

}
