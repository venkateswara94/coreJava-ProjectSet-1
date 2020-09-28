package org.com.vehicle.booking.client;

/**
 * 
 * @author venkatesh
 *
 */
public class VehicleBookingRQ {

	// customerdetails, vehiclerq

	private String custId;
	
	private String gender;

	private int age;
	
	private String country;
	
	private String vehicleId;

	private String vehicleName;

	private String companyName;

	private int noOfWheels;

	public VehicleBookingRQ() {
	}

	public VehicleBookingRQ(String custId, String gender, int age, String country, String vehicleId, String vehicleName,
			String companyName, int noOfWheels) {
		super();
		this.custId = custId;
		this.gender = gender;
		this.age = age;
		this.country = country;
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	@Override
	public String toString() {
		return "VehicleBookingRQ [custId=" + custId + ", gender=" + gender + ", age=" + age + ", country=" + country
				+ ", vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", companyName=" + companyName
				+ ", noOfWheels=" + noOfWheels + "]";
	}
}
