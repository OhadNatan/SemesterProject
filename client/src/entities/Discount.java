package entities;

public class Discount {
	private int	discountPercentages;
	private String startDate;
	private String endDate;
	
	
	public Discount(int discountPercentages, String startDate, String endDate) {
		super();
		this.discountPercentages = discountPercentages;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getDiscountPercentages() {
		return discountPercentages;
	}
	public void setDiscountPercentages(int discountPercentages) {
		this.discountPercentages = discountPercentages;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
