package mypackage;

public class Encpsulate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bank b=new Bank();
    b.setAccount_name(23444589);
    b.setAmount(400);
    b.setE_mail("aryansrivastav016@gmail.com");
    b.setName("aryan");
    System.out.print(b.getAccount_name());
    System.out.print(b.getAmount());
    System.out.print(b.getE_mail());
    System.out.print(b.getName());
    }

}
