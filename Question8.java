package Assigment1;
class okay<T>
{
	void print(T n)
	{
		System.out.print((2*(int)n)/3);
	}
}
public class Question8 {
	public static void main(String[] args){
		okay<Integer> obj=new okay<>();
		obj.print(2);
	}
}
