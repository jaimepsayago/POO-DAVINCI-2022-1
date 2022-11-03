package clase03112022SolPrueba2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<Item> items; //declarar array
	
	public ShoppingCart() {
		//inicializar el array
		this.items= new ArrayList<Item>();
	}
	
	//agregar
	public void addItem (Item item) {
		this.items.add(item);
	}

	//remover
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	//calcular
	public int calculateTotal() {
		//con todos los items de mi array sumar los valores
		int sum=0;
		for(Item i: items) {
			sum+=i.getPrice();
		}
		
		return sum;
		
	}
	
	//pay
	public void pay(PaymentInterface paymentMethod) {
		int mount = calculateTotal(); //con un valor 
		paymentMethod.pay(mount); //correcto
		
		
	}
	
	
}
