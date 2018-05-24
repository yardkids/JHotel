package jhotel.controller;

import org.springframework.web.bind.annotation.*;
import jhotel.*;

@RestController
/**
 * Kelas ini digunakan untuk melakukan aktivitas terkait costumer dengan melalui koneksi IP Address
 *
 * @author Anggi Harumanto - 1506673744
 * @version 2018.05.24
 */
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    /**
     * Method ini digunakan untuk membuat customer baru
     * @param name
     * @param email
     * @param password
     * @return customer
     */
    @RequestMapping(value = "/newcustomer",  method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email, @RequestParam(value="password") String password) {
        Customer customer = new Customer(name, 26, 3, 2018, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch(Exception ex) {
            ex.getMessage();
            return null;
        }

        return customer;
    }

    /**
     * Method ini digunakan untuk melakukan login customer
     * @param email
     * @param password
     * @return customer
     */
    @RequestMapping(value = "/logincust", method = RequestMethod.POST)
    public Customer loginCust(@RequestParam(value = "email") String email,
                              @RequestParam(value = "password") String password){
        Customer customer = DatabaseCustomer.getCustomerLogin(email, password);
        return customer;
    }

    /**
     * Method ini digunakan untuk mengambil daftar customer dari id yang dimasukan
     * @param id
     * @return customer
     */
    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }

}