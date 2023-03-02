package LMS;

import java.util.Scanner;

public class SmallestNumber {
          public static void smallest(int a,int b,int c) {
        	  if(a<b&&a<c) {
        		  System.out.println(a+" is the smallest number");
        	  }
        	  else if(b<a&&b<c) {
        		  System.out.println(b+" is the smallest number");
        	  }
        	  else  {
        		  System.out.println(c+" is the smallest number");
        	  }
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int s=sc.nextInt();
      System.out.println("enter the number");
      int e=sc.nextInt();
      System.out.println("enter the number");
      int f=sc.nextInt();
      smallest(s,e,f);                                             
	}

}
