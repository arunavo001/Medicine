package com.example.Medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller
{
    @Autowired
    CustomerService customerService;
    @GetMapping("/getData")
    public List<Customer> getAll()
    {
        return customerService.getAll();
    }
   @GetMapping("/getData/{id}")
    public Customer getUserById(@PathVariable("id") int id)
    {
        return customerService.getMedicineById(id);
    }
    @PostMapping("/getData")
    private int saveCustomer(@RequestBody Customer customer)
    {
        customerService.saveOrUpdate(customer);
        return customer.getId();
    }
    @PutMapping("/books")
    private Customer update(@RequestBody Customer customer)
    {
        customerService.saveOrUpdate(customer);
        return customer;
    }
}
