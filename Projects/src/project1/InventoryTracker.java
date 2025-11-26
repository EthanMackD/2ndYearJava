package project1;

public class InventoryTracker {

	private String name;
	private int stockQuantity;
	private double price;

	public InventoryTracker(String name, int startQuantity, double startPrice) {
		this.name = name;
		this.stockQuantity = startQuantity;
		this.price = startPrice;
	}

	public void setPrice(double newPrice) {

		if (newPrice > 0) {
			this.price = newPrice;
		} else {
			System.out.println("Error: price cannot be negative");
		}
	}

	public int getStock() {
		return this.stockQuantity;
	}

	public void sellItem(int count) {
		if (this.stockQuantity >= count) {
			this.stockQuantity-=count;
			System.out.println("Sold " + count + " of " + name);
		} else {
			System.out.println("Error: Insufficient stock.");
		}
	}

	public static void main(String[] args) {

		InventoryTracker Book = new InventoryTracker("Java Basics", 25, 19.99);
		InventoryTracker Pen = new InventoryTracker("Gel Pen", 100, 1.50);

		Book.sellItem(5);
		Pen.sellItem(102);
		Book.setPrice(22.50);

		System.out.println(Book.getStock());

	}
}
