package clase13102022EjemploInterfaces2;

//cuenta de ahorros
public class SavingBankAccount implements BankAccount {
	private double balance;
	private double annualInteresRate;
	private double lastAmountInterestEarned;

	
	public SavingBankAccount(final Double balance, final Double interestRate) {
		this.balance=balance;
		this.annualInteresRate=interestRate;
		this.lastAmountInterestEarned = 0.0;
				
	}
	
	@Override
	public Double getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(Double amount) {
	this.balance= this.balance+amount;
		
	}

	@Override
	public void withDraw(Double amount) {
		if ( amount<this.balance) {
			this.balance= this.balance-amount;
		}
		
	}
	
	//agregar metodo para el interes
	public void addInterest() {
		//obtener el interes mensual
		Double mesInteres = annualInteresRate/12;
		//calcular la cantidad de interes ganados
		this.lastAmountInterestEarned = mesInteres * this.balance;
		//agregar el interes al saldo
		this.balance = this.balance+lastAmountInterestEarned;
	}

	public double getLastAmountInterestEarned() {
		return lastAmountInterestEarned;
	}

	public void setLastAmountInterestEarned(double lastAmountInterestEarned) {
		this.lastAmountInterestEarned = lastAmountInterestEarned;
	}
	
	
	
}
