package day2;

public class Product extends Manufacturer {

	private String productType;
	private String productName;
	private int    productPrice;
	
	public Product(String manufacurer,int counter,String productType, String productName, int productPrice) {
		super(manufacurer,counter);
		this.productType = productType;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String prooductName) {
		this.productName = prooductName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public void productInfo() {
		manufactureInfo();
		System.out.println("Product Type : "+productType);
		System.out.println("ProductName : "+productName);
		System.out.println("Product Price : "+productPrice);
		
	}
	
	
	

}
