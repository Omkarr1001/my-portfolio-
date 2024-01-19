package demo1;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		Employe e1=new Employe();
		Employe e2=new Employe();
		Employe e3=new Employe();
		Employe e4=new Employe();
		Employe e5=new Employe();
		
	e1.id=1;e1.name="Omkar";e1.role="Manger";e1.salary=6000000f;
	e2.id=2;e2.name="Aniket";e2.role="Devloper";e2.salary=500000f;
	e3.id=3;e3.name="Digvijay";e3.role="Rector";e3.salary=300000f;
	e4.id=4;e4.name="Nilesh";e4.role="Testor";e4.salary=200000f;
	e5.id=5;e5.name="Nil";e5.role="Testor";e5.salary=500000f;
	
	
	HashSet<Employe> H=new HashSet<Employe>();    //Uniquess is maintain 
	 H.add(e1);
	H.add(e2);
	H.add(e2);
	H.add(e3);
	H.add(e4);
	H.add(e5);
	H.remove(e4);
	//H.add(1,e2);
	//H.clear();
	H.forEach(t->System.out.println(t));
	
	

	}
	
	
	}
	
	
	
	
	


