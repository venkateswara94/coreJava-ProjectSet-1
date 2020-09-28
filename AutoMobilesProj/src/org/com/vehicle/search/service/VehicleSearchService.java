package org.com.vehicle.search.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.com.customer.Address;
import org.com.customer.Customer;
import org.com.customer.service.CustomerService;
import org.com.vehicle.Vehicle;
import org.com.vehicle.VehicleDataUtil;
import org.com.vehicle.exceptioin.VehicleValidationException;
import org.com.vehicle.search.client.VehicleSearchRQ;
import org.com.vehicle.search.client.VehicleSearchRS;
import org.com.vehicle.validator.ValidatorUtil;

/**
 * 
 * @author venkatesh
 *
 */
public class VehicleSearchService {

	public VehicleSearchRS getVehicles(VehicleSearchRQ request) throws VehicleValidationException {
		System.out.println("VehicleSearchService::getVehicles::start");
		boolean isValidRQ = ValidatorUtil.validateVehicleSearchRequest(request);
		
		
		if (!isValidRQ)
			throw new VehicleValidationException("mandatory fields missiong from " + request);
		if (request.getNoOfWheels() <= 0 || request.getNoOfWheels() >= 5)
			throw new VehicleValidationException("Please specify valid number of wheels");

		Customer customer = setCustomerSearchRQ(request);
		CustomerService custService = new CustomerService();
		List<Customer> existCustList = custService.getCustomers();
		if (!existCustList.contains(customer))
			throw new VehicleValidationException("Requested Customer not available");
		
		Customer matchedCustomer = existCustList.get(0);
		VehicleSearchRS vehicleRS = new VehicleSearchRS();
		vehicleRS.setAvailableToBook("In Stock");
		vehicleRS.setCity(matchedCustomer.getAddresses().get(0).getCity());
		List<Vehicle> vehicleList = VehicleDataUtil.getVehiclesData();

		vehicleRS.setVehicleList(
				vehicleList.stream().filter(vehicle -> vehicle.getNoOfWheels() == request.getNoOfWheels())
						.sorted((v1, v2) -> v1.getPrice().equals(v2.getPrice())).collect(Collectors.toList()));

		System.out.println("Search Results :: "+vehicleRS);
		
		System.out.println("VehicleSearchService::getVehicles::end");
		return vehicleRS;
	}

	/**
	 * 
	 * @param request, adopting request to actual customer obj to make easy comparing objs
	 * @return, customer obj
	 */
	private Customer setCustomerSearchRQ(VehicleSearchRQ request) {
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