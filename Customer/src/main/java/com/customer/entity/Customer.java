package com.customer.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;

    private String custName;

    private String custAddress;

    private long custContactNumber;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date custDOB;

    private int productId;
}
