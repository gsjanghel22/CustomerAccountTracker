package aicp.foundation.bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import aicp.foundation.bank.exception.ResourceNotFoundException;
import aicp.foundation.bank.entity.Customer;
import aicp.foundation.bank.services.CustomerService;

@RestController
public class BankController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers() throws ResourceNotFoundException 
	{
		if (customerService.getAllCustomers().isEmpty()) {
			throw new ResourceNotFoundException("No Customers Found!!!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(customerService.getAllCustomers());
	}
	
	@GetMapping("/getCustomerByName/{customerName}")
	public ResponseEntity<Customer> getCustomerByName(@PathVariable String customerName) 
	{
		return ResponseEntity.status(HttpStatus.OK).body(customerService.getCustomerByName(customerName));
	}

	
	@GetMapping("/findCustomerById/{id}")
	public ResponseEntity<Optional<Customer>> findCustomerById(@PathVariable int id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(customerService.findCustomerById(id));
	}
	
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(customerService.addCustomer(customer));
	}
	
	
	@PutMapping("/updateCustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer)
	{
		return ResponseEntity.status(HttpStatus.OK).body(customerService.updateCustomer(customer));
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		return ResponseEntity.status(HttpStatus.OK).body(customerService.deleteById(id));
	}
	
	@DeleteMapping("/deleteAllCustomers")
	public ResponseEntity<String> deleteAllCustomers()
	{
		return ResponseEntity.status(HttpStatus.OK).body(customerService.deleteAllCustomers());
	}
}
