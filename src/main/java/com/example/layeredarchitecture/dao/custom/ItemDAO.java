package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO> {
   /* public ArrayList<ItemDTO> GetAllItems() throws SQLException, ClassNotFoundException;
    public boolean DeleteItem(String code) throws SQLException, ClassNotFoundException;

    public boolean SaveItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    public boolean UpdateItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    public boolean ExistItem(String code) throws SQLException, ClassNotFoundException;

    public String GenarateItemId() throws SQLException, ClassNotFoundException;
    public ItemDTO findItem(String codes) throws SQLException, ClassNotFoundException;
    public ItemDTO FindItem(String newItemCode) throws SQLException, ClassNotFoundException;
    public boolean update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;*/
}
