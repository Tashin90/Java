import java.lang.*;
public class Start
{
	public static void main(String[]args)
	{
		Account obj1=new Account();
		obj1.setAccountNumber(23455);
		obj1.setAccountHolderName("kimti");
		obj1.setBalance(9000000);
		obj1.showDetails();
		
		Account obj2=new Account(21233,"Tashin",666655);
		obj2.showDetails();
		
	}
}