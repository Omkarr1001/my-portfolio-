package Demo2;
import java.util.ArrayList;
public class XTest {
	public static void main(String[] args) {
		Employe e1=new Employe();
		Employe e2=new Employe();
		Employe e3=new Employe();
		Employe e4=new Employe();
		
	e1.id=1;e1.name="Omkar";e1.role="Manger";e1.salary=6000000f;
	e2.id=2;e2.name="Aniket";e2.role="Devloper";e2.salary=500000f;
	e3.id=3;e3.name="Digvijay";e3.role="Rector";e3.salary=300000f;
	e4.id=1;e4.name="Nilesh";e4.role="Testor";e4.salary=200000f;
	
	ArrayList<Employe> O=new  ArrayList<Employe>();
	O.add(e1);
	O.add(e2);
	O.add(e3);
	O.add(e4);
	
	
	X obj=new X();
	obj.display(O);
	
	Employe Maxsal=obj.maxSalary(O);
	System.out.println(Maxsal.id+" "+Maxsal.name+" "+Maxsal.salary+" ");
	
	Employe Minsal=obj.minSalary(O);
	System.out.println(Minsal.id+" "+Minsal.name+" "+Minsal.salary+" ");
	
	ArrayList<Employe>Incr=obj.increment(O,"Nilesh", 4f);
	
	float totalsal=obj.totalSal(O);
	
	System.out.println(totalsal);
	obj.display(O);	
	
	
	
	
	}

}
