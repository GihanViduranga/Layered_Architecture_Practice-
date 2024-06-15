package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public interface OrderDetailDAO {
    public boolean addOrderDetails(String orderId, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException ;
    public boolean saveOrderDetail(String id ,OrderDetailDTO orderDetailDTO) throws SQLException ;
}
