package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.Impl.ItemDAOImpl;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl {
    ItemDAO itemDAO = new ItemDAOImpl();
    public ArrayList<ItemDTO> loadAll() throws SQLException, ClassNotFoundException{
        return itemDAO.loadAll();
    }
    public boolean Delete(String code) throws SQLException, ClassNotFoundException{
        return itemDAO.Delete(code);
    }
    public boolean Save(ItemDTO item) throws SQLException, ClassNotFoundException{
        return itemDAO.Save(item);
    }
    public boolean Update(ItemDTO item) throws SQLException, ClassNotFoundException{
        return itemDAO.Update(item);
    }
    public boolean Exists(String code) throws SQLException, ClassNotFoundException{
        return itemDAO.Exists(code);
    }
    public String GenarateNextId() throws SQLException, ClassNotFoundException{
        return itemDAO.GenarateNextId();
    }
    public ItemDTO Search(String newItemCode) throws SQLException, ClassNotFoundException{
        return itemDAO.Search(newItemCode);
    }
}
