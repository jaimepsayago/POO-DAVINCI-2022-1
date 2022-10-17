package clase13102022EjemploInterfaces2;

//ceunta corriente
public class CurrentBankAccount implements BankAccount {
	
	private Double balance;
	
	public CurrentBankAccount(final Double balance) {
		this.balance=balance;
	}

	@Override
	public Double getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(final Double amount) {
		this.balance= this.balance+ amount;
		
	}

	@Override
	public void withDraw(final Double amount) {
		if (amount < this.balance) {
			this.balance= this.balance-amount;
		}
	
		
	}

}
