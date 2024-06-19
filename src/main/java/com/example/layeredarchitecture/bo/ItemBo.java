package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {
    public ArrayList<ItemDTO> loadAll() throws SQLException, ClassNotFoundException;
    public boolean Delete(String code) throws SQLException, ClassNotFoundException;
    public boolean Save(ItemDTO item) throws SQLException, ClassNotFoundException;
    public boolean Update(ItemDTO item) throws SQLException, ClassNotFoundException;
    public boolean Exists(String code) throws SQLException, ClassNotFoundException;
    public String GenarateNextId() throws SQLException, ClassNotFoundException;
    public ItemDTO Search(String newItemCode) throws SQLException, ClassNotFoundException;
}
