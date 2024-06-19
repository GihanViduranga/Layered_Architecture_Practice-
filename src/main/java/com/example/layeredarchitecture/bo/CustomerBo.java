package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBo {
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException;
    public boolean Save(CustomerDTO customer) throws SQLException, ClassNotFoundException;
    public boolean Update(CustomerDTO customer) throws SQLException, ClassNotFoundException;
    public boolean Exists(String id) throws SQLException, ClassNotFoundException;
    public boolean Delete(String id) throws SQLException, ClassNotFoundException;
    public String GenarateNextId() throws SQLException, ClassNotFoundException;
    public CustomerDTO Search(String newValue) throws SQLException, ClassNotFoundException;
}
