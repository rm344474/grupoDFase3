package br.com.fiap.abctechapi.service;

import br.com.fiap.abctechapi.model.Assistance;
import br.com.fiap.abctechapi.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrdersList();
    void saveOrder(Order order, List<Long> arrayAssists) throws Exception;
    List<Order> listOrderByOperator(Long operatorId);

}