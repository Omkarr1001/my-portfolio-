package Demo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		
		Product p1=new Product(01,"Notebook",80d,"Stationary");
		Product p2=new Product(02,"Pen",50d,"Stationary");
		Product p3=new Product(05,"Kivi",120d,"Food");
		Product p4=new Product(03,"Grapes",100d,"Food");
		Product p5=new Product(06,"Milk",50d,"milk");
		Product p6=new Product(07,"GoatMilk",70d,"Milk");
		
		ArrayList<Product> L1=new ArrayList<Product>();
	    L1.add(p1);
	    L1.add(p2);
	    L1.add(p3);
	    L1.add(p4);
	    L1.add(p5);
	    L1.add(p6);
	    L1.add(4, p2);
	    
	    
		//Collections.sort(l1);


		
		
		
		double disPercentage=10.0;
		
	
		
		for (Product product :L1) {
			product.applyDiscount(10);
		}
		
		L1.forEach(aa->System.out.println(aa));
		
		
		
		
	}

}
