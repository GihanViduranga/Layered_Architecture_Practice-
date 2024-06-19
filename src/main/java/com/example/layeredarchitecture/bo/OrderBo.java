package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderBo {
    public boolean Save(OrderDTO orderDTO) throws SQLException, ClassNotFoundException;
    public boolean Exists(String orderId) throws SQLException, ClassNotFoundException;
    public String GenarateNextId() throws SQLException, ClassNotFoundException;
}
