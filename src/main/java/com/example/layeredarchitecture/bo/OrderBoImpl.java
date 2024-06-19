package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.Impl.OrderDAOImpl;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public class OrderBoImpl implements OrderBo {
    OrderDAO orderDAO = new OrderDAOImpl();

    public OrderBoImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public boolean Save(OrderDTO orderDTO) throws SQLException, ClassNotFoundException{
        return orderDAO.Save(orderDTO);
    }
    @Override
    public boolean Exists(String orderId) throws SQLException, ClassNotFoundException{
        return orderDAO.Exists(orderId);
    }
    @Override
    public String GenarateNextId() throws SQLException, ClassNotFoundException{
        return orderDAO.GenarateNextId();
    }
}
