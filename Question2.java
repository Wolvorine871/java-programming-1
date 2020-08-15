package Assigment1;
import java.util.*;
class Rectangle
{
	int width;
	int height;
	void display()
	{
		System.out.println("Width: "+width+" , Height : "+height);
	}
}
class RectangleArea extends Rectangle
{
	void get_input(int w,int h)
	{
		this.width=w;
		this.height=h;
	}
	void display()
	{
		super.display();;
		System.out.println("Area : "+this.height*this.width);
	}
}
public class Question2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RectangleArea react=new RectangleArea();
		int w=sc.nextInt();
		int h=sc.nextInt();
		react.get_input(w, h);
		react.display();
		sc.close();
	}

}
