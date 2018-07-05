package com.foobar.repository;

import java.util.List;

import com.foobar.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}