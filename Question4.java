package Assigment1;
import java.util.*;
class Circle
{
	private double radius;
	private String color;
	Circle()
	{
		this.radius=1.0;
		this.setColor("red");
	}
	Circle(double r,String c)
	{
		this.radius=r;
		this.setColor(c);
	}
	double getRadius()
	{
		return radius;
	}
	double getArea()
	{
		return (3.14*radius*radius);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
public class Question4 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Circle circle=new Circle();
		Circle circle1=new Circle(7,"Black");
		System.out.println(circle.getArea());
		System.out.println(circle1.getArea());
		sc.close();
	}

}
