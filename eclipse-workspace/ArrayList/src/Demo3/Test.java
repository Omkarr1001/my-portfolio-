package Demo3;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		
		Item i1=new Item(101,"pen",20,25);
		Item i2=new Item(102,"pencil",5,15);
	
		
		
		ArrayList<Item> items=new ArrayList<Item>();
		items.add(i1);
		items.add(i2);
		
		
		
		for(Item t:items)
			System.out.println(t);
		
		items.stream().forEach(t->System.out.println(t));
		
	}

}
