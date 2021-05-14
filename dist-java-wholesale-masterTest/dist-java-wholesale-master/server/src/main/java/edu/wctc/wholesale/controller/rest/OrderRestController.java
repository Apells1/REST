package edu.wctc.wholesale.controller.rest;

import edu.wctc.wholesale.dto.OrderDTO;
import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.repos.WholesaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.GetMapping;
import org.springframework.beans.factory.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
public class OrderRestController {
    @Autowired
    private WholesaleOrderRepository orderRepository;
    private OrderDTO convert(WholesaleOrder order);
    private OrderDTO dto = new OrderDTO();
    dto.setCustomerName(order.getCustomer().getName());
    dto.setDate(order.getPurchaseDate());
    dto.setPoNumber(order.getPurchaseOrderNumber());
    dto.setProductName(order.getProduct().getName());
    dto.setShipped(order.getShippedDate());
    dto.setTerms(order.getTerms());
    dto.setProductName(order.getProduct().getName());
    dto.setTotal(order.getProduct().getCost());
    return dto;

}
@GetMapping("/api/orders");
@CrossOrigin(origins = "http://localhost:63342");
public List<OrderDTO> getOrders(){
    Iterable<Order> OrderList = orderRepository.findAll();
    List<OrderDTO> dtoList = new ArrayList<>();
    for (Order order : orderList){
        dtoList.add(convert(order));
        }
    return dtoList;
        }
