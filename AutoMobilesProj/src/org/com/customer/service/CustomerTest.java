package org.com.customer.service;

import java.util.List;

import org.com.customer.Customer;
/**
 * 
 * @author venkatesh
 *
 */
public class CustomerTest {

	public static void main(String[] args) {
		CustomerService custService = new CustomerService();
		List<Customer> custList = custService.getCustomers();
		custList.stream().forEach(System.out::println);
		
		/*Calendar calendar = Calendar.getInstance();
		calendar.set(23, 9,2019);
		System.out.println(calendar.getTime());*/
		
		
	}

}
