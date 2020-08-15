package Assigment1;

import java.util.Arrays;
import java.util.List;

class Employee
{
	private int empid;
	private String emName;
	private String empDesignation;
	private long empSalary;
	private String empLocation;
	Employee(int empid,String emName,String empDesignation,long empSalary,String empLocation)
	{
		this.empid=empid;
		this.emName=emName;
		this.empDesignation=empDesignation;
		this.empSalary=empSalary;
		this.empLocation=empLocation;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmName() {
		return emName;
	}
	public void setEmName(String emName) {
		this.emName = emName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
}
public class Question3 {
	public static void main(String[] args){
		List<Employee> lst=Arrays.asList(
				new Employee(1,"Deepak","Analyst",100000,"Delhi"),
				new Employee(2,"Tushar","Manager",40000,"Mohali"),
				new Employee(3,"Ram","Digital Head",10000,"Pune"),
				new Employee(4,"Shyam","Software Intern",20000,"Bangalore"),
				new Employee(5,"Sourav","Web developer",70000,"Chandigarh"),
				new Employee(6,"Ayush","Department HirE",80000,"Noida"),
				new Employee(7,"Sojanya","Social Team",10000,"Mumbai"),
				new Employee(8,"Malay","Head of Marketing",15000,"Gurgoan"),
				new Employee(9,"Ronak","Junior Analyst",20000,"Chennai"),
				new Employee(10,"Sheela","Senior Intern",25000,"jalandhar")
				);
		//Q-1:Print the name of all the employees.
		lst.stream().forEach(p->System.out.println(p.getEmName()));
		
		//Q-2:Print all the salaries which are greater than 50,000/-
		lst.stream().filter(p->p.getEmpSalary()>50000).forEach(p->System.out.println(p.getEmpSalary()));
		
		//Q-3:Print all the locations starting with the letter ‘M’
		lst.stream().filter(p->p.getEmpLocation().startsWith("M")).forEach(p->System.out.println(p.getEmpLocation()));
		
		//Q-4:Print all the designations ending with ‘E’
		lst.stream().filter(p->p.getEmpDesignation().endsWith("E")).forEach(p->System.out.println(p.getEmpDesignation()));
	}

}
