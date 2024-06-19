package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.Impl.ItemDAOImpl;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBo {
    ItemDAO itemDAO = new ItemDAOImpl();
    @Override
    public ArrayList<ItemDTO> loadAll() throws SQLException, ClassNotFoundException{
        return itemDAO.loadAll();
    }
    @Override
    public boolean Delete(String code) throws SQLException, ClassNotFoundException{
        return itemDAO.Delete(code);
    }
    @Override
    public boolean Save(ItemDTO item) throws SQLException, ClassNotFoundException{
        return itemDAO.Save(item);
    }
    @Override
    public boolean Update(ItemDTO item) throws SQLException, ClassNotFoundException{
        return itemDAO.Update(item);
    }
    @Override
    public boolean Exists(String code) throws SQLException, ClassNotFoundException{
        return itemDAO.Exists(code);
    }
    @Override
    public String GenarateNextId() throws SQLException, ClassNotFoundException{
        return itemDAO.GenarateNextId();
    }
    @Override
    public ItemDTO Search(String newItemCode) throws SQLException, ClassNotFoundException{
        return itemDAO.Search(newItemCode);
    }
}
