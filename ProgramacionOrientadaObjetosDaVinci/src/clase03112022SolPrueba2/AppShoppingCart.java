package clase03112022SolPrueba2;

public class AppShoppingCart {

	public static void main(String[] args) {
	
		//obj shopping cart
		ShoppingCart cart = new ShoppingCart();
		
		//items para agregar al carrito
		Item i1 = new Item(1, "zapato", 10);
		Item i2 = new Item(2, "camisa", 30);
		Item i3 = new Item(2, "gorra", 50);
		
		
		//items agregados al carrito
		cart.addItem(i1);
		cart.addItem(i2);
		cart.addItem(i3);
		
		//tipo de pago
		cart.pay(new CreditCardPayment("juan zapata", "1254521", "786", "15/48"));
		
		
		cart.pay(new PayPalPayment("11", "jijij"));
			
		
		//eliminar
		cart.removeItem(i2);
		
		
		//el pago
		System.out.println(cart.calculateTotal());
		
		

	}

}
