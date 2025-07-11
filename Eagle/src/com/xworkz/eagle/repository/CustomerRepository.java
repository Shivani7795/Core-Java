package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CustomerDto;

import java.util.Set;

public interface CustomerRepository {
    Set<CustomerDto> findCustomer();
}
