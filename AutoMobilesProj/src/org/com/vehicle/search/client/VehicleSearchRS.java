package org.com.vehicle.search.client;

import java.util.List;

import org.com.vehicle.Vehicle;
/**
 * 
 * @author venkatesh
 *
 */
public class VehicleSearchRS {

	
	private List<Vehicle> vehicleList;
	
	//private String vehicleId;

	private String city;
	
	private String country;

	//private String vehicleName;

	//private String companyName;

	//private double totalPrice;

	//private int noOfWheels;

	private String availableToBook;

	//private String dealerName;

	public VehicleSearchRS(){}


	public VehicleSearchRS(List<Vehicle> vehicleList, String city, String country, String availableToBook) {
		super();
		this.vehicleList = vehicleList;
		this.city = city;
		this.country = country;
		this.availableToBook = availableToBook;
	}



	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAvailableToBook() {
		return availableToBook;
	}

	public void setAvailableToBook(String availableToBook) {
		this.availableToBook = availableToBook;
	}

	@Override
	public String toString() {
		return "VehicleSearchRS [vehicleList=" + vehicleList + ", city=" + city + ", country=" + country
				+  ", availableToBook=" + availableToBook + "]";
	}
	
}
