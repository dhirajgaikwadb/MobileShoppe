package modelclass;

public class Productmodel {
	
	private String ProductName;
	private int ProductPrice;
	private int ProductQuantity;
	private int Ram;
	private int Rom;
	private String Photo;
	public Productmodel(String productName, int productPrice, int productQuantity, int ram, int rom,String photo) {
		super();
		ProductName = productName;
		ProductPrice = productPrice;
		ProductQuantity = productQuantity;
		Ram = ram;
		Rom = rom;
		Photo = photo;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public int getRom() {
		return Rom;
	}
	public void setRom(int rom) {
		Rom = rom;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	
	
}
