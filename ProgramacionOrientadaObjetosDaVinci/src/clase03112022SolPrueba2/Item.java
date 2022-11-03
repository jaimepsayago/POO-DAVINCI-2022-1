package clase03112022SolPrueba2;

public class Item {
	private int id;
	private String upcCode;
	private int price;
	
	public Item() {
		
	}

	public Item(int id, String upcCode, int price) {
		this.id=id;
		this.upcCode=upcCode;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public int getPrice() {
		return price;
	}

	
	
	
}
