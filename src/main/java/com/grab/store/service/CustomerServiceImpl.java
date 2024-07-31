package com.grab.store.service;

import com.grab.store.model.Customer;
import com.grab.store.repo.CartDAO;
import com.grab.store.repo.CustomerDAO;
import com.grab.store.model.Cart;

import com.grab.store.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerRepository;

    @Autowired
    private CartDAO cartRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Integer id, Customer customerDetails) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setCustomerName(customerDetails.getCustomerName());
        customer.setMobileNumber(customerDetails.getMobileNumber());
        customer.setEmail(customerDetails.getEmail());
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }
}
