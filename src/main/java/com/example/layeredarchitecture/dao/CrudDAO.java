package com.example.layeredarchitecture.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> {
    public ArrayList<T> loadAll() throws SQLException, ClassNotFoundException;
    public boolean Save(T customer) throws SQLException, ClassNotFoundException;
    public boolean Update(T customer) throws SQLException, ClassNotFoundException;
    public boolean Exists(String id) throws SQLException, ClassNotFoundException;
    public boolean Delete(String id) throws SQLException, ClassNotFoundException;
    public String GenarateNextId() throws SQLException, ClassNotFoundException;
    public T Search(String newValue) throws SQLException, ClassNotFoundException;
}
