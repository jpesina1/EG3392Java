
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		
		BankAccount b= new BankAccount(10);
		BankAccount c= new BankAccount(0);
		b.withdraw(100);
		System.out.println(b.getBalance());
		BankAccount a= new BankAccount(-10);
		a.deposit(100);
		a.withdraw(99);
		System.out.println(a.getBalance());
		}
		catch (NegativeBalanceException e){
			System.out.println("NegativeBalanceException occurs");
		}
		catch(Exception ex){
			System.out.println("An error occurred");
		}
		System.out.println("Program ends");
		
	
	
	}

}
