package org.com.vehicle.booking.client;

import org.com.vehicle.price.BillStructure;

/**
 * 
 * @author venkatesh
 *
 */
public class VehicleBookingRS {

	private String vehicleId;

	private String vehicleName;

	private String companyName;

	private int noOfWheels;

	private String availableToBook;

	private BillStructure billStructure;
	
	public VehicleBookingRS(){}

	public VehicleBookingRS(String vehicleId, String vehicleName, String companyName, int noOfWheels,
			String availableToBook, BillStructure billStructure) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.availableToBook = availableToBook;
		this.billStructure = billStructure;
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

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getAvailableToBook() {
		return availableToBook;
	}

	public void setAvailableToBook(String availableToBook) {
		this.availableToBook = availableToBook;
	}

	public BillStructure getBillStructure() {
		return billStructure;
	}

	public void setBillStructure(BillStructure billStructure) {
		this.billStructure = billStructure;
	}

	@Override
	public String toString() {
		return "VehicleBookingRS [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", companyName="
				+ companyName + ", noOfWheels=" + noOfWheels + ", availableToBook=" + availableToBook
				+ ", billStructure=" + billStructure + "]";
	}
	
}
