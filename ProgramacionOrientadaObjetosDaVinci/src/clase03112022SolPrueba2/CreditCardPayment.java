package clase03112022SolPrueba2;

public class CreditCardPayment  implements PaymentInterface {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	
	public CreditCardPayment() {
	
	}
	public CreditCardPayment(String n, String cnm, String cvv, String expiryDate) {
		this.name=n;
		this.cardNumber=cnm;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	@Override
	public void pay(int mount) {
		System.out.println(mount + "pago con tarjeta de credito");
		
	}

}
