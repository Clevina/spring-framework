package springioc_basics2_SetterInjection2;

public class Phone {

	private String brand;
	private String colour;
	private int cost;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", colour=" + colour + ", cost=" + cost + "]";
	}
	
	
}
