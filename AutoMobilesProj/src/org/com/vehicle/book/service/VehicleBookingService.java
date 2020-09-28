package org.com.vehicle.book.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import org.com.customer.Address;
import org.com.customer.Customer;
import org.com.customer.service.CustomerService;
import org.com.vehicle.Vehicle;
import org.com.vehicle.VehicleDataUtil;
import org.com.vehicle.booking.client.VehicleBookingRQ;
import org.com.vehicle.booking.client.VehicleBookingRS;
import org.com.vehicle.exceptioin.VehicleValidationException;
import org.com.vehicle.price.BillStructure;
import org.com.vehicle.validator.ValidatorUtil;

/**
 * 
 * @author venkatesh
 *
 */
public class VehicleBookingService { 
	
	public VehicleBookingRS bookVehicle(VehicleBookingRQ request) throws VehicleValidationException {
	System.out.println("VehicleBookingService::bookVehicle::start");
	boolean isValidRQ = ValidatorUtil.validateVehicleBookingRequest(request);
	
	
	if (!isValidRQ)
		throw new VehicleValidationException("mandatory fields missiong from " + request);
	if (request.getNoOfWheels() <= 0 || request.getNoOfWheels() >= 5)
		throw new VehicleValidationException("Please specify valid number of wheels");
	
	
	Customer customer = setCustomerSearchRQ(request);
	Vehicle reqVehicle = new Vehicle();
	reqVehicle.setCompanyName(request.getCompanyName());
	reqVehicle.setVehicleId(request.getVehicleId());
	reqVehicle.setNoOfWheels(request.getNoOfWheels());
	reqVehicle.setVehicleName(request.getVehicleName());
	
	CustomerService custService = new CustomerService();
	List<Customer> existCustList = custService.getCustomers();
	if (!existCustList.contains(customer))
		throw new VehicleValidationException("Requested Customer not available");
	Customer matchedCustomer = existCustList.get(0);
	VehicleBookingRS vehicleRS = new VehicleBookingRS();
	vehicleRS.setAvailableToBook("In Stock");
	
	
	
	List<Vehicle> vehicleList = VehicleDataUtil.getVehiclesData().stream().
			filter(vehicle -> (vehicle.getNoOfWheels() == request.getNoOfWheels() && vehicle.equals(reqVehicle))).
			collect(Collectors.toList());
	
	if(vehicleList.isEmpty())throw new VehicleValidationException("Requested Vehicle not available");
		
	Vehicle vehicleFromList = vehicleList.get(0);
	vehicleRS.setVehicleId(vehicleFromList.getVehicleId());
	vehicleRS.setVehicleName(vehicleFromList.getVehicleName());
	vehicleRS.setCompanyName(vehicleFromList.getCompanyName());
	vehicleRS.setNoOfWheels(vehicleFromList.getNoOfWheels());
	
	BillStructure billStructure = new BillStructure();
	
	billStructure.setBillNumber(5755);
	billStructure.setCustomerDetails(matchedCustomer);
	vehicleFromList.getPrice().setPaymentDone(true);
	billStructure.setPriceDetails(vehicleFromList.getPrice());
	Calendar calender = Calendar.getInstance();
	calender.set(2020, 12, 10);
	billStructure.setSoldDate(calender.getTime());
	billStructure.setWarrantyInMonths(20);
	vehicleRS.setBillStructure(billStructure);
	
	System.out.println("VehicleBookingService::bookVehicle::end");
	return vehicleRS;
	
	}
	
	
	/**
	 * 
	 * @param request, adopting request to actual customer obj to make easy comparing objs
	 * @return, customer obj
	 */
	private Customer setCustomerSearchRQ(VehicleBookingRQ request) {
		List<Address> addressList = new ArrayList<Address>();
		Address addr = new Address();
		addr.setCountry(request.getCountry());
		addr.setPrimaryAddress(true);
		addressList.add(addr);
		Customer customer = new Customer();
		customer.setCustId(request.getCustId());
		customer.setGender(request.getGender());
		customer.setAddresses(addressList);
		return customer;
	}
}
