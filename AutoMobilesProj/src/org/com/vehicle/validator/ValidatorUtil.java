package org.com.vehicle.validator;

import org.com.vehicle.booking.client.VehicleBookingRQ;
import org.com.vehicle.exceptioin.VehicleValidationException;
import org.com.vehicle.search.client.VehicleSearchRQ;
/**
 * 
 * @author venkatesh
 *
 */
public class ValidatorUtil {
	
	
	/**
	 * validate the search request parameters
	 * @param request
	 * @return
	 * @throws VehicleValidationException
	 */
	public static boolean validateVehicleSearchRequest(VehicleSearchRQ request)throws VehicleValidationException{
		
		return (request!=null && isNotEmpty(request.getCustId()) && 
				isNotEmpty(request.getCountry()) && isNotEmpty(request.getGender()) && request.getAge()!=0);
				
	}
	
	/**
	 * validate the booking request parameters
	 * @param request
	 * @return
	 * @throws VehicleValidationException
	 */
	public static boolean validateVehicleBookingRequest(VehicleBookingRQ request)throws VehicleValidationException{
		
		return (request!=null && isNotEmpty(request.getCustId()) && 
				isNotEmpty(request.getCountry()) && isNotEmpty(request.getGender()) && 
				isNotEmpty(request.getVehicleId()) && isNotEmpty(request.getCompanyName()) && request.getAge()!=0);
	}
	
	/**
	 * util method to check string empty
	 * @param str
	 * @return
	 */
	private static boolean isNotEmpty(String str){
		return (str!=null && !str.equals(""));
	}

}
