package Newpackage;

public class Bank {
	int p = 500;
	  int t = 1;
      int a;
      int r;
	  void getRateOfIntrest() {
	     r = (100 * a) / (p * t);
	  }
}
  class Sbi extends Bank{
		  int a = 40;

		  void getRateOfIntrest() {
		    int r = (100 * a) / (p * t);
		    System.out.println(r);
		  }
	  }
	class Icic extends Bank {
		  int a = 35;

		  void getRateOfIntrest() {
		    int r = (100 * a) / (p * t);
		    System.out.println(r);
		  }
		}
	  class Boi extends Bank {
		  int a = 45;

		  void getRateOfIntrest() {
		    int r = (100 * a) / (p * t);
		    System.out.println(r);
		  }
		}

