package Assigment1;
class Complex
{
	int real;
	int imaginary;
	void sum(int r1,int i1,int r2,int i2)
	{
		real=r1+r2;
		imaginary=i1+i2;
		if(imaginary==0)
		{
			System.out.println("Sum of two Complex no. : "+real);
		}
		else if(imaginary>0)
		{
			System.out.println("Sum of two Complex no. : "+real+"+"+imaginary+"i");
		}
		else
		{
			System.out.println("Sum of two Complex no. : "+real+" "+imaginary+"i");
		}
		
	}
	void difference(int r1,int i1,int r2,int i2)
	{
		real=r1-r2;
		imaginary=i1-i2;
		if(imaginary==0)
		{
			System.out.println("Difference of two Complex no. : "+real);
		}
		else if(imaginary>0)
		{
			System.out.println("Difference of two Complex no. : "+real+"+"+imaginary+"i");
		}
		else
		{
			System.out.println("Difference of two Complex no. : "+real+" "+imaginary+"i");
		}
	}
	void product(int a,int b,int c,int d)
	{
		real=(a*c)-(b*d);
		imaginary=(a*d)+(b*c);
		System.out.println(real);
		if(imaginary==0)
		{
			System.out.println("Product of two Complex no. : "+real);
		}
		else if(imaginary>0)
		{
			System.out.println("Product of two Complex no. : "+real+"+"+imaginary+"i");
		}
		else
		{
			System.out.println("Product of two Complex no. : "+real+" "+imaginary+"i");
		}
	}
}
public class Question5 {
	public static void main(String[] args){
		Complex c=new Complex();
		c.product(1, 2, 1, -2);
	}

}
