package com.luiz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.course.entities.OrderItem;
import com.luiz.course.entities.pk.OrderItemPK;
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
