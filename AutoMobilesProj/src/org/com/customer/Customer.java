package org.com.customer;

import java.util.List;
import java.util.stream.Collectors;

import org.com.vehicle.exceptioin.VehicleValidationException;
/**
 * 
 * @author venkatesh
 *
 */
public class Customer {

	//unique id in the country
	private String custId;
	
	private String cName;
	
	private  String gender;
	
	private int age;
	
	//private String occupation;
	
	private String identityProof;
	
	private List<Address> addresses;
	
	//private String modeOfPayment;
	
	public Customer(){}


	public Customer(String custId, String cName, String gender, int age, String identityProof,
			List<Address> addresses) {
		super();
		this.custId = custId;
		this.cName = cName;
		this.gender = gender;
		this.age = age;
		this.identityProof = identityProof;
		this.addresses = addresses;
	}


	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public String getIdentityProof() {
		return identityProof;
	}

	public void setIdentityProof(String identityProof) {
		this.identityProof = identityProof;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", cName=" + cName + ", gender=" + gender + ", age=" + age
				+ ", identityProof=" + identityProof + ", addresses=" + addresses + "]";
	}
	
	/**
	 * to check uniqueness of customer obj.
	 */
	@Override
	public boolean equals(Object obj) {
		 if (obj instanceof Customer) {
			 Customer cust = (Customer) obj;		
			 boolean custIdCheck = this.getCustId().equalsIgnoreCase(cust.getCustId());
			List<Address> existingAddress =  this.getAddresses().stream()
				.filter(addr -> addr.isPrimaryAddress()).collect(Collectors.toList());
			
			List<Address> requestedAddress =  cust.getAddresses().stream()
					.filter(addr -> addr.isPrimaryAddress()).collect(Collectors.toList());
			
			if(existingAddress.isEmpty() || requestedAddress.isEmpty())
				try {
					throw new VehicleValidationException("Invalid Address .. please choose primary address");
				} catch (VehicleValidationException e) {
					System.out.println(e.getMessage());
				}
			return custIdCheck && existingAddress.get(0).getCountry().equalsIgnoreCase(requestedAddress.get(0).getCountry());
		 } else

			return false;
	}
}
