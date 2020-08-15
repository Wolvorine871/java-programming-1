package Assigment1;

import java.util.Arrays;
import java.util.List;

class Employe{
	String Name;
	int yearOfjoining;
	String Address;
	Employe(String Name,int yearOfjoining,String Address)
	{
		this.Name=Name;
		this.yearOfjoining=yearOfjoining;
		this.Address=Address;
	}
	void print()
	{
		System.out.println(Name+"\t"+yearOfjoining+"\t"+Address);
	}
}
public class Question6 {
	public static void main(String[] args) {
		List<Employe> mylist=Arrays.asList(
				new Employe("Robert",1994,"64C-WallStreet"),
				new Employe("Sam",2000,"68D-WallStreet"),
				new Employe("John",1999,"26B-WallStreet")
				);
		System.out.println("Name"+"\t"+"yearOfjoining"+"\t"+"Address");
		mylist.stream().forEach(p->p.print());
		
	}

}
