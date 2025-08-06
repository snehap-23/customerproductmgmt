package com.customer.service;

import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;
import com.customer.vo.Product;
import com.customer.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Customer save(Customer customer){
       return customerRepository.save(customer);
    }
    public ResponseVO findById(int custId)
    {
        ResponseVO responseVO=new ResponseVO();

        Customer customer=customerRepository.findByCustId(custId);
        responseVO.setCustomer(customer);

        Product product = restTemplate.getForObject("http://ProductService/product/findById/" + customer.getProductId(), Product.class);
        responseVO.setProduct(product);
        return responseVO;


    }

}
