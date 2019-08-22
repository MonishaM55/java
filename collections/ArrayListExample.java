package collections;
import java.util.*;
class Book{
	int id,quantity;
    String name,author,publisher;
    public Book(int id,String name,String author,String publisher,int quantity) {
    	this.id=id;
    	this.name=name;
    	this.author=author;
    	this.publisher=publisher;
    	this.quantity=quantity;
    }
}
public class ArrayListExample {
	public static void main(String[] args) {
		List<Book> list=new ArrayList<Book>();
		Book b1=new Book(101,"let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communication & Networking","Forouzan"," Mc GrawHill",4);
		Book b3=new Book(103,"Operating System","Galvin","BPB",6);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for(Book b:list){
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
	}


