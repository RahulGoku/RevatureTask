package day2;

public class Manufacturer {
	private String manufacturer;
	private int counter;
	
	public Manufacturer(String manufacturer, int counter) {
		this.manufacturer = manufacturer;
		this.counter = counter;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public void manufactureInfo() {
		System.out.println("Manufacture : "+manufacturer);
		System.out.println("Counter :"+counter);
	}
	

}
