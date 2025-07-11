package com.xworkz.eagle.repository;

import com.xworkz.eagle.dto.CustomerDto;
import com.xworkz.eagle.dto.PassportDto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    private final Set<CustomerDto> customerSet = new HashSet<>();

    public CustomerRepositoryImpl(PassportRepository passportRepository) {
        Iterator<PassportDto> iterator = passportRepository.findPassport().iterator();

        customerSet.add(new CustomerDto("Alice", 30, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Bob", 28, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Charlie", 35, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Diana", 25, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Edward", 40, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Fiona", 32, "Female", iterator.next()));
        customerSet.add(new CustomerDto("George", 27, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Hannah", 22, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Ian", 45, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Julia", 29, "Female", iterator.next()));

        customerSet.add(new CustomerDto("Kevin", 33, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Laura", 26, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Michael", 38, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Nina", 24, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Oscar", 36, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Paula", 31, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Quentin", 42, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Rachel", 34, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Steve", 39, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Tina", 23, "Female", iterator.next()));

        customerSet.add(new CustomerDto("Umar", 37, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Vera", 28, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Walter", 41, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Xena", 30, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Yusuf", 29, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Zara", 27, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Amit", 36, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Bhavna", 32, "Female", iterator.next()));
        customerSet.add(new CustomerDto("Chetan", 34, "Male", iterator.next()));
        customerSet.add(new CustomerDto("Divya", 26, "Female", iterator.next()));
    }

    @Override
    public Set<CustomerDto> findCustomer() {
        return customerSet;
    }
}
