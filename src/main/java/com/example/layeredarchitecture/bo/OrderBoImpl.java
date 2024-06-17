package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.Impl.OrderDAOImpl;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public class OrderBoImpl {
    OrderDAO orderDAO = new OrderDAOImpl();

    public OrderBoImpl() throws SQLException, ClassNotFoundException {
    }

    public boolean Save(OrderDTO orderDTO) throws SQLException, ClassNotFoundException{
        return orderDAO.Save(orderDTO);
    }
    public boolean Exists(String orderId) throws SQLException, ClassNotFoundException{
        return orderDAO.Exists(orderId);
    }
    public String GenarateNextId() throws SQLException, ClassNotFoundException{
        return orderDAO.GenarateNextId();
    }
}
