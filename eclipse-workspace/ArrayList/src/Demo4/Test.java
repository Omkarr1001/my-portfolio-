	package Demo4;
	
	import java.util.*;
	
	
	public class Test {
		public static void main(String[] args) {
			
			Bus b1=new Bus(101,"MH11OS2355","ForPune",60);
			Bus b2=new Bus(102,"MH11OS2255","ForKarad",50);
			Bus b3=new Bus(103,"MH11OS6040","ForMumbai",55);
			Bus b4=new Bus(104,"MH11OS2566","ForPune",53);
			
			
		//	HashSet<Bus>busses=new HashSet<bus>(); // hash set is used to dont add duplicate item
			ArrayList<Bus> buses=new ArrayList<Bus>(); //array list can add duplicate item
			buses.add(b1);
			buses.add(b2);
			buses.add(b3);
			
		    
			
			buses.add(2,b4);// for add the data to 2nd index
			//buses.clear();// for clear the data
		
			System.out.println(buses.size());// to print size of array
			
			buses.stream().forEach(t->System.out.println(t));// used to replace for loop
			/*buses
			.stream()// to collect one by one object
			.filter(t->t.capacity>50);// used to filter the data and use to take condition
			.forEach(t->System.out.println(t));*/
			
			System.out.println("===============================================================================");
			
			Ticket t1=new Ticket(1,"L1","Omkar",150);
			Ticket t2=new Ticket(2,"L2","nilu",100);
			Ticket t3=new Ticket(3,"L3","aniket",250);
			Ticket t4=new Ticket(4,"L4","digu",350);
			
			ArrayList<Ticket> t=new ArrayList<Ticket>();
			t.add(t1);
			t.add(t2);
			t.add(t3);
			t.add(t4);
			
			
			System.out.println(t.size());
			
			
			t.stream()
			.filter(q->q.tid>0)
			.forEach(q->System.out.println(q));
			
			
			
			
		} 
	
	}
