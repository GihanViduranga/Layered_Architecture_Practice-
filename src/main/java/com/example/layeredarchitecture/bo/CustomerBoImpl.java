package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.Impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBoImpl {
    CustomerDAO customerDAO = new CustomerDAOImpl();
    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException {
        return customerDAO.loadAll();
    }
    public boolean Save(CustomerDTO customer) throws SQLException, ClassNotFoundException {
        return customerDAO.Save(customer);
    }
    public boolean Update(CustomerDTO customer) throws SQLException, ClassNotFoundException {
       return customerDAO.Update(customer);
    }
    public boolean Exists(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.Exists(id);
    }
    public boolean Delete(String id) throws SQLException, ClassNotFoundException {
       return customerDAO.Delete(id);
    }
    public String GenarateNextId() throws SQLException, ClassNotFoundException {
        return customerDAO.GenarateNextId();
    }
    public CustomerDTO Search(String newValue) throws SQLException, ClassNotFoundException {
       return customerDAO.Search(newValue);
    }
}
