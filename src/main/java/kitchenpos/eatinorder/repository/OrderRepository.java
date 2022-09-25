package kitchenpos.eatinorder.repository;

import kitchenpos.deliveryorder.domain.OrderStatus;
import kitchenpos.eatinorder.domain.Order;
import kitchenpos.eatinorder.domain.OrderTable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findById(UUID id);

    List<Order> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, OrderStatus status);
}

