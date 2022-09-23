package javaYT31;

public class Product {
	
	
	private int id;
	private String name; 
	private String description; 	
	private double price;
	private int stockAmount;
	private String kod;
	private String renk;
	

	public Product() {
		System.out.println("yapıcı kod çalıştı");
	}

	
	public Product(int id, String name, String description, double price, int stockAmount, String kod,String renk) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.kod = kod;
		this.renk=renk;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int _id) {
		this.id=_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	

	public String getKod() {
		return this.getName().substring(0,1);
	}

	public String getRenk() {
		return renk;
	}
	
	public void setRenk(String renk) {
		this.renk=renk;
	}

	
}
