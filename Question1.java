package Assigment1;
import java.util.*;

interface Safedivision
{
	public double divide(double a,double b);
}
interface Add{
	public double add(double a,double b);
}
interface Difference
{
	public double difference(double a,double b);
}
interface Product{
	public double product(double a,double b);
}
public class Question1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("********WELCOME TO BASIC CALCULATOR********");
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Difference");
		System.out.println("Enter 3 for SafeDivision");
		System.out.println("Enter 4 for Product");
		System.out.println("Enter 5 for All Operation");
		int i=sc.nextInt();	
		Safedivision dividethenumber = (double a,double b) -> {
			if(b==0)
			{
				return 0;
			}
			return a/b;
		};
		
		Add addno=(double a,double b)->{
			return a+b;
		};
		
		Difference diff=(double a,double b)->{
			return a-b;
		};
		
		Product prod=(double a,double b)->{
			return a*b;
		};
		switch(i){
			case 1:
			{
				double a=sc.nextDouble();
				double b=sc.nextDouble();
				System.out.println("Addition : "+addno.add(a, b));
				break;
			}
			case 2:
			{
				double a=sc.nextDouble();
				double b=sc.nextDouble();
				System.out.println("Differrence : "+diff.difference(a, b));
				break;
			}
			case 3:
			{
				double a=sc.nextDouble();
				double b=sc.nextDouble();
				System.out.println("Division : "+dividethenumber.divide(a, b));
				break;
			}
			case 4:
			{
				double a=sc.nextDouble();
				double b=sc.nextDouble();
				System.out.println("Product : "+prod.product(a, b));
				break;
			}
			case 5:
			{
				double a=sc.nextDouble();
				double b=sc.nextDouble();
				System.out.println("Addition : "+addno.add(a, b));
				System.out.println("Differrence : "+diff.difference(a, b));
				System.out.println("Division : "+dividethenumber.divide(a, b));
				System.out.println("Product : "+prod.product(a, b));
				break;
			}
		}
		sc.close();
	}
}
