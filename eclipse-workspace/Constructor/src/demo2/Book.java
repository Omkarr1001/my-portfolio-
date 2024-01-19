package demo2;

public class Book {
private int id;
private  String name;
private String author;
private  float price;

Book(){
	
	
}
public Book(int id, String name, String author,float price)
{
	super();
	this.id=id;
	this.name=name;
	this.author=author;
	this.price=price;
	
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
}


}
