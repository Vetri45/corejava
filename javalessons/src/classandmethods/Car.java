package classandmethods;
/**
 * 
 * @author vetr3139
 *
 */

public class Car {
	private final String regNo;
	private int yearOfpurchase;
	private String color;
	private String fuel;
	
	public Car (String rno)
	{
		this.regNo=rno;
	}

	public int getYearOfpurchase() {
		return yearOfpurchase;
	}

	public void setYearOfpurchase(int yearOfpurchase) {
		this.yearOfpurchase = yearOfpurchase;
	}

	public String getRegNo() {
		return regNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

}
