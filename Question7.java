package Assigment1;
class Triangle{
	double Area(int a,int b,int c)
	{
		double s=(a+b+c)/2;
		double in=s*(s-a)*(s-b)*(s-c);
		double area=Math.sqrt(in);
		return area;
	}
}
public class Question7 {
	public static void main(String[] args){
		Triangle t=new Triangle();
		System.out.print(t.Area(3,4,5));
	}

}
