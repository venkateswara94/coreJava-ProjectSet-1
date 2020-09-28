package org.com.vehicle;

import java.util.Date;
import java.util.List;
/**
 * 
 * @author venkatesh
 *
 */
public class VehicleInventory {
	
	//instock or outofstock
    private String availableToBook;
    
    private int noOfWheels;
    
	private List<Vehicle> vehicles; 
	
	private int noOfVehicles;
	
	//private String vehicleCatagory;
	
	//private int waitToDeliverCount;
	
	//private int requestedToDeliverCount;
	
	//private Date deliveredOn;
	
	//private Date requestedOn;
	
	private Date currentDate;
	
	private Date expectedToDeliverOn;

	//private Integer yearOfManufactured;
	
	//private PriceDetailsVO price;
	//private int oldStockCount;
	
	//private String remarks;
	
	//list of vendors

	VehicleInventory(){}
	
	public VehicleInventory(String availableToBook, int noOfWheels, List<Vehicle> vehicles, int noOfVehicles,
			Date currentDate, Date expectedToDeliverOn) {
		super();
		this.availableToBook = availableToBook;
		this.noOfWheels = noOfWheels;
		this.vehicles = vehicles;
		this.noOfVehicles = noOfVehicles;
		this.currentDate = currentDate;
		this.expectedToDeliverOn = expectedToDeliverOn;
	}

	public String getAvailableToBook() {
		return availableToBook;
	}

	public void setAvailableToBook(String availableToBook) {
		this.availableToBook = availableToBook;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public int getNoOfVehicles() {
		return noOfVehicles;
	}

	public void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public Date getExpectedToDeliverOn() {
		return expectedToDeliverOn;
	}

	public void setExpectedToDeliverOn(Date expectedToDeliverOn) {
		this.expectedToDeliverOn = expectedToDeliverOn;
	}

	@Override
	public String toString() {
		return "VehicleInventory [availableToBook=" + availableToBook + ", noOfWheels=" + noOfWheels + ", vehicles="
				+ vehicles + ", noOfVehicles=" + noOfVehicles + ", currentDate=" + currentDate
				+ ", expectedToDeliverOn=" + expectedToDeliverOn + "]";
	}
	
	
	
}
