package oopIntro;

public class Product {
	//encapsulation
	private int id; //final elemanlar� d��ar�dan eri�im noktas�nda k�s�tlar. final sadece constructure da set edilebilir demektir.
	private String name;//private sadece bu classta �al���r d��ar�dan eri�imi engellemek i�in kullan�l�r.
	private double unitPrice;
	private String detail;
	private double discount;
	
	
	public Product() {}
	
	
	public Product(int id, String name, double unitPrice, String detail, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;
	
	}
	
	public int getId() {
		return id;//okumak i�in return name kullan�l�r. gelen de�eri bir yere atayaca��z.
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
	//constructror blo�u yazma
	//rule : bir constructor �al��mak zorunda ayn� tipte yaz�lanlar �al���r ( AYNI �MZA)
	
	/*public Product() {
		System.out.println("�al���yorumm");
	}
	public Product(int id, String name, double unitPrice, String detail) {
		//�al���yorumm constructorunun �al��mas� i�in
		this(); //yapmak gerekir.constructorlar kendi i�inde �al��abilir.
		this.id=id; //this classtaki demektir.
		this.name=name;
		this.detail=detail;
		this.unitPrice= unitPrice;
	}*/
	
	
	

}
