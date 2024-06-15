package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> GetAllItems() throws SQLException, ClassNotFoundException;
    public void DeleteItem(String code) throws SQLException, ClassNotFoundException;

    public void SaveItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    public void UpdateItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    public boolean ExistItem(String code) throws SQLException, ClassNotFoundException;

    public String GenarateItemId() throws SQLException, ClassNotFoundException;
    public ItemDTO findItem(String codes) throws SQLException, ClassNotFoundException;
    public ItemDTO FindItem(String newItemCode) throws SQLException, ClassNotFoundException;
    public int update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;
}
