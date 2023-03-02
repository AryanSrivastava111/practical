package LMS;

public class Student {
    int a;
    String b;
	Student(){
    System.out.println("this is the default");
    this.a=a;
    this.b=b;
    System.out.println(a+" "+b);
       }
	Student(int a,int b){
		int s=a*b;
		System.out.println("the multiplication is the  = "+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st=new Student();
Student st1=new Student(5,6);
	}

}
