package jhotel.controller;

import org.springframework.web.bind.annotation.*;
import jhotel.*;

@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/newcustomer",  method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String name, @RequestParam(value="email") String email,
                            @RequestParam(value = "tahun", required = false, defaultValue = "2000") int tahun) {
        Customer customer = new Customer(name, 10, 10, tahun, email);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch(Exception ex) {
            ex.getMessage();
            return null;
        };

        return customer;
    }

    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }

}