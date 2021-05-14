package edu.wctc.wholesale.controller.rest;

import edu.wctc.wholesale.dto.OrderDTO;
import edu.wctc.wholesale.repos.WholesaleOrderRepository;

@RestController
public class OrderController {
    @Autowired
    private WholesaleOrderRepository orderRepository;

    private OrderDTO convert (Order order){
        OrderDTO dto = new OrderDTO();
        dto.setCustomerName(order.getCustomer().getName());
        dto.setDate(order.getPurchaseDate());
        dto.setPoNumber(order.getPurchaseOrderNumber);

    }
}
