// public class Cup {
// 	private String size;
// 	private double price;
// 	private int amount;

// 	public Cup(String size,int amount) {
// 		// super();
// 		this.size = size;
// 		this.amount = amount;
// 		price = 0.0;	
// 	}

// 	public String getSize() {
// 		return size;
// 	}

// 	public void setSize(String size) {
// 		this.size = size;
// 	}

// 	public double getPrice() {
// 		return price;
// 	}

// 	public void setPrice(double price) {
// 		this.price = price;
// 	}

// 	public int getAmount() {
// 		return amount;
// 	}

// 	public void setAmount(int amount) {
// 		this.amount = amount;
// 	}

// 	@Override
// 	public String toString() {
// 		return String.format("%d %s cup(s) of ", this.getAmount(), this.getSize());
// 	}
// }

public class Cake {
    private String size;
    private double price;
    private int quantity;

    public Cake(String size, int quantity) {
        this.size = size;
        this.quantity = quantity;
        price = 0.0;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%d %s cake(s) ", this.getQuantity(), this.getSize());
    }

}
