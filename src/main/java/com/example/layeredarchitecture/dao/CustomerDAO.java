package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> loadAllCustomers() throws SQLException, ClassNotFoundException;

    public void SaveCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException;

    public void UpdateCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException;

    public boolean ExistsCustomer(String id) throws SQLException, ClassNotFoundException;

    public void DeleteCustomer(String id) throws SQLException, ClassNotFoundException;
    public String GenarateNextId() throws SQLException, ClassNotFoundException;
    public CustomerDTO SearchCustomer(String newValue) throws SQLException, ClassNotFoundException;
}
