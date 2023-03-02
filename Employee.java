package Newpackage;

public class Employee {
	int startingSalary=20000;
	int nowSalary=0;
	void IncrementSalary(){
	int is=nowSalary-startingSalary;
	System.out.println(is);
	}
	}
	class Developer extends Employee{
	int nowSalary=30000;
	void IncrementSalary(){
	int is=nowSalary-startingSalary;
	System.out.println(is);
	}
	}
	class Manager extends Employee{
	int nowSalary=40000;
	void IncrementSalary(){
	int is=nowSalary-startingSalary;
	System.out.println(is);
	}
}
