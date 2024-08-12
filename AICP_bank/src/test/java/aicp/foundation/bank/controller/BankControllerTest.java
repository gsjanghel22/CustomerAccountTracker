package aicp.foundation.bank.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import aicp.foundation.bank.entity.Customer;
import aicp.foundation.bank.exception.ResourceNotFoundException;
import aicp.foundation.bank.services.CustomerService;

@SpringBootTest
class BankControllerTest {
	
	@Mock
	CustomerService customerService;

	@InjectMocks
	BankController bankController;

	@Test
	public void getAllCustomers() throws ResourceNotFoundException {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Gaurav", null));
		when(customerService.getAllCustomers()).thenReturn(customers);
		ResponseEntity<List<Customer>> res = bankController.getAllCustomers();
		assertEquals(HttpStatus.OK, res.getStatusCode());
		assertEquals(1, res.getBody().size());
	}
	
	@Test
	public void getCustomerByName() {
		String name = "Gaurav";
		Customer customer = new Customer("Gaurav", null);
		when(customerService.getCustomerByName(name)).thenReturn(customer);
		assertEquals(name, customerService.getCustomerByName(name).getName());
	}


}
