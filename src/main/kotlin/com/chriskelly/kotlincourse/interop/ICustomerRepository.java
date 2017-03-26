package com.chriskelly.kotlincourse.interop;

import com.chriskelly.kotlincourse.classes.CustomerJava;

import java.util.List;

/**
 * ICustomerRepository
 *
 * @author bigkahuna
 * @since 26/03/2017
 */
public interface ICustomerRepository {

    CustomerJava getById(int id);

    List<CustomerJava> getAll();
}
