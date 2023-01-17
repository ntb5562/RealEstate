
public class House {
	//member variables
	private int ID;
	private double price;
	private boolean status;
	
	//constructor
	public House(int id, double p, boolean stat) {
		this.ID = id;
		this.price = p;
		this.status = stat;
	}
	
	//setters and getters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void printMe() {
		System.out.println("ID: " + this.ID);
		System.out.println("Price: "+ this.price);
		System.out.println("Status: "+ this.status);
	}
	
}
