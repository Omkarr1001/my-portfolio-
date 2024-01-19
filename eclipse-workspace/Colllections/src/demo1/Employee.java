package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;



public class Employee {
	public static void main(String[] args) {
		Employe e1=new Employe();
		Employe e2=new Employe();
		Employe e3=new Employe();
		Employe e4=new Employe();
		
	e1.id=1;e1.name="Omkar";e1.role="Manger";e1.salary=6000000f;
	e2.id=2;e2.name="Aniket";e2.role="Devloper";e2.salary=500000f;
	e3.id=3;e3.name="Digvijay";e3.role="Rector";e3.salary=300000f;
	e4.id=4;e4.name="Nilesh";e4.role="Testor";e4.salary=200000f;
	
	ArrayList<Employe> O=new  ArrayList<Employe>();
	O.add(e1);
	O.add(e2);
	O.add(e3);
	O.add(e4);
	
	
	System.out.println("---------------1.Iterating with enhanced for--------------------------");
	for(Employe e:O) {
		System.out.println(e);
	}
	
	System.out.println("------------------2.Iterating with simple for--------------------------");
	for(int i=0;i<O.size();++i) {
		Employe t=O.get(i);
	System.out.println(t);
	}
	
	System.out.println("--------------------3.By using Iterator method------------------------ ");
	Iterator<Employe> e=O.iterator();
	while(e.hasNext()) {
		Employe t=e.next();
		System.out.println(t);
	}
	
	System.out.println("-----------------4.By using IteratorList-------------------------------");
	ListIterator<Employe> lit=O.listIterator();
	while(lit.hasNext()) {
		Employe t=lit.next();
		System.out.println(t);
		
		
	}
	
	System.out.println("-----------------4.(Backword)By using IteratorList-------------------------------");
	
	while(lit.hasPrevious()) {
		Employe t=lit.previous();
		System.out.println(t);
	}
	System.out.println("-----------------5.By using collection with enumeration---------------------------------------");
	
	
	Enumeration<Employe> te=Collections.enumeration(O);
	while(te.hasMoreElements()) {
		Employe t=te.nextElement();
		System.out.println(t);
}
	//System.out.println("-----------------6.By using ForEach method---------------------------------------");O.
	O.forEach(t->System.out.println(t));
	
	
	
	
	}

}
