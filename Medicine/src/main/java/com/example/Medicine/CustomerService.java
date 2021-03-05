package com.example.Medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService
{
    @Autowired
    FetchService fetchService;
    public List<Customer> getAll()
    {
        List<Customer> user = new ArrayList<Customer>();
        fetchService.findAll().forEach(users -> user.add(users));
        return user;
    }
    public Customer getMedicineById(int id)
    {
        return fetchService.findById(id).get();
    }
    public void saveOrUpdate(Customer customer)
    {
        fetchService.save(customer);
    }
    public void update(Customer customer, int id)
    {
        fetchService.save(customer);
    }
}
