package Demo4;

public class Ticket {
	int tid;
	String seatnos;
	String name;
	float totalbill;
	
	public Ticket()
	{
		
	}

	public Ticket(int tid, String seatnos, String name, float totalbill) {
		super();
		this.tid = tid;
		this.seatnos = seatnos;
		this.name = name;
		this.totalbill = totalbill;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", seatnos=" + seatnos + ", name=" + name + ", totalbill=" + totalbill + "]";
	}

}
