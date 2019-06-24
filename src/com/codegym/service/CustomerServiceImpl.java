package com.codegym.service;
import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer,Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1,"Anh","anh@gmail.com","Nam Dinh"));
        customers.put(2, new Customer(2,"Lan","lan@gmail.com","Thanh Hoa"));
        customers.put(3, new Customer(3,"Ly","ly@gmail.com","Hung Yen"));
        customers.put(4, new Customer(4,"Quyen","quyen@gmail.com","Ha Noi"));
        customers.put(5, new Customer(5,"Rie","rei@gmail.com","Tokyo"));
        customers.put(6, new Customer(6,"Fukuda","fukuda@gmail.com","Osaka"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
            customer.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
