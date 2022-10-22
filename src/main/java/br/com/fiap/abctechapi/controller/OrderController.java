package br.com.fiap.abctechapi.controller;

import br.com.fiap.abctechapi.application.OrderApplication;
import br.com.fiap.abctechapi.application.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderApplication orderApplication;

    public OrderController(
            @Autowired OrderApplication orderApplication
    ){
        this.orderApplication = orderApplication;
    }
    @GetMapping()
    public ResponseEntity<List<OrderDto>> getAssists(){
        List<OrderDto> list = orderApplication.getOrdersList();
        return ResponseEntity.ok(list);
    }
    @PostMapping
    public ResponseEntity createOrder(@RequestBody OrderDto orderDto) throws Exception {
        orderApplication.createOrder(orderDto);
        return ResponseEntity.ok().build();
    }

}