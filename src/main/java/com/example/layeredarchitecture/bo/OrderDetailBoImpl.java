package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.Impl.OrderDetailDAOImpl;
import com.example.layeredarchitecture.dao.custom.OrderDetailDAO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public class OrderDetailBoImpl {
    OrderDetailDAO orderDetailDAO = new OrderDetailDAOImpl();
    public boolean Save(OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException{
        return orderDetailDAO.Save(orderDetailDTO);

    }
}
