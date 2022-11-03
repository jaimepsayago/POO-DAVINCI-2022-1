package clase03112022SolPrueba2;

public class PayPalPayment  implements PaymentInterface{

	private String emialId;
	private String password;
	
	public PayPalPayment() {
		
	}
	
	public PayPalPayment(String email, String pwd) {
	this.emialId=email;
	this.password=pwd;
	}
	
	@Override
	public void pay(int mount) {
		System.out.println(mount + "pago usando Paypal");
		
	}

	public String getEmialId() {
		return emialId;
	}

	public void setEmialId(String emialId) {
		this.emialId = emialId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//toString
	//equals
	//hash

}
