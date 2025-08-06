package com.customer.controller;

import com.customer.entity.Customer;
import com.customer.service.CustomerService;
import com.customer.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/saveCust")
    public ResponseEntity<Customer> saveCust(@RequestBody Customer customer)
    {
        return ResponseEntity.ok(customerService.save(customer));

    }
    @GetMapping("/findbyid/{custId}")
    public ResponseEntity<ResponseVO> findById(@PathVariable int custId)
    {
        return ResponseEntity.ok(customerService.findById(custId));
    }

}
