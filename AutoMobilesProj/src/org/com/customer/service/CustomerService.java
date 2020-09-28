package org.com.customer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.com.customer.Customer;
import org.com.customer.CustomerDataUtil;
/**
 * 
 * @author venkatesh
 *
 */
public class CustomerService {
	
	private List<String> validDocs(){
		List<String> ldocs = new ArrayList<String>();
		ldocs.add("AADHAR");
		ldocs.add("PAN");
		ldocs.add("PASSPORT");
		return ldocs;
	}
	
	/**
	 * validate the customer as per customer business rules
	 * @return
	 */
	public List<Customer> getCustomers(){
		List<Customer> custList = CustomerDataUtil.getCustomers();
		return custList.stream().filter(customer->this.isValidCustomer(customer)).collect(Collectors.toList());
	}

	/**
	 * validate the customer as per customer business rules
	 * @return
	 */
	private boolean isValidCustomer(Customer customer){
		Predicate<Customer> custPredicate = cust->cust.getAge()>=20;
		return custPredicate.test(customer);
	}
}
