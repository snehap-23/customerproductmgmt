package com.customer.vo;

import com.customer.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO {

    private Customer customer;

    private Product product;
}
