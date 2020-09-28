package org.com.vehicle;

import org.com.vehicle.price.PriceDetails;
/**
 * 
 * @author venkatesh
 *
 */
public class Vehicle {
		
	private String vehicleId;
	
	private String vehicleName;
	
	private String companyName;
	
	private PriceDetails price;
	
	private String dealerName;
	
	//private String city;
	
	private int noOfWheels;
	
	public Vehicle(){}

	public Vehicle(String vehicleId, String vehicleName, String companyName, PriceDetails price, String dealerName,
			int noOfWheels) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.companyName = companyName;
		this.price = price;
		this.dealerName = dealerName;
		this.noOfWheels = noOfWheels;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public PriceDetails getPrice() {
		return price;
	}

	public void setPrice(PriceDetails price) {
		this.price = price;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", companyName=" + companyName
				+ ", price=" + price + ", dealerName=" + dealerName + ", noOfWheels=" + noOfWheels + "]";
	}

	
	//private String isShowroomVehicle;
	
	//private String edd;
	
	//Dealer(inventory) , customer(Address), Showroom(Services), RateAndPrice(BillStructure) 
	
	/**
	 * to verify requested vehicle is unique or not - used for sort vehicle
	 */
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Vehicle){
			Vehicle vehicle = (Vehicle)obj;
			return vehicle.getVehicleId().equalsIgnoreCase(this.getVehicleId()) && 
					vehicle.getCompanyName().equalsIgnoreCase(this.getCompanyName());
		}else{
			return false;
		}
	}
	
}
