package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<CustomerDTO> {
    /*public ArrayList<CustomerDTO> loadAllCustomers() throws SQLException, ClassNotFoundException;

    public Object SaveCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException;

    public Object UpdateCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException;

    public boolean ExistsCustomer(String id) throws SQLException, ClassNotFoundException;

    public boolean DeleteCustomer(String id) throws SQLException, ClassNotFoundException;
    public String GenarateNextId() throws SQLException, ClassNotFoundException;
    public CustomerDTO SearchCustomer(String newValue) throws SQLException, ClassNotFoundException;*/
}
