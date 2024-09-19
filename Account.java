import java.lang.*;
public class Account
{
	private int  accountNumber;
	private  String accountHolderName;
	private  double balance;
	
	public Account()
	{
		System.out.println("EMPTY");
		
	}
	public Account( int an,String h,double b)
	{
		System.out.println("Perameter con");
		this.accountNumber=an;
		this.accountHolderName=h;
		this.balance=b;
	}
	public void setAccountNumber(int an)
	{
		accountNumber=an;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountHolderName(String ahn)
	{
		accountHolderName=ahn;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
		
		public void setBalance(double b)
	{
		balance=b;
	}
	public double getBalance()
	{
		return balance;
	}
	 
	public void showDetails()
	{
		System.out.println("............");
		System.out.println("Number:"+ accountNumber);
		System.out.println("HolderName:"+ accountHolderName);
		System.out.println("Balance:"+ balance);
		System.out.println("THANK YOU");
	}
		
		
	
}