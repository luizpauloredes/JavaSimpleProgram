package entities;

import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufactureDate;
	
	private UsedProduct () {		
	}
 	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		 
		return super.getName() + "(used)  $ " + super.getPrice() + " (Manufacture date: 15/03/2017)";
	}


	
	
	
}
