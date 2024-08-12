package aicp.foundation.bank.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aicp.foundation.bank.entity.Customer;
import aicp.foundation.bank.entity.repository.CustomerRepository;
import aicp.foundation.bank.entity.Account;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer getCustomerByName(String customerName) {
		return customerRepository.findByName(customerName);
	}
	
	public Optional<Customer> findCustomerById(int id) {
		return customerRepository.findById(id);
	}

	public String deleteById(int id) {
		customerRepository.deleteById(id);
		return "The id has been deleted : " + id;
	}

	public String deleteAllCustomers() {
		customerRepository.deleteAll();
		return "All Customers Deleted Successfully!!!";
	}
	
	public Customer createAccount(Customer customer, String addAccountType) {
		List<Account> customers = customer.getAccount();
		Account account = new Account();
		account.setAccountType(addAccountType);
		account.setAmount(5000);
		customers.add(account);
		return customerRepository.save(customer);
	}

}
