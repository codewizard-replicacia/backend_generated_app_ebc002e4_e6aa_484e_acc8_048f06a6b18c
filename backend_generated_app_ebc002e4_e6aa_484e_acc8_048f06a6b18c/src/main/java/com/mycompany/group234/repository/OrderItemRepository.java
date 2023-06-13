package com.mycompany.group234.repository;


import com.mycompany.group234.model.OrderItem;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OrderItemRepository extends SimpleJpaRepository<OrderItem, String> {
    private final EntityManager em;
    public OrderItemRepository(EntityManager em) {
        super(OrderItem.class, em);
        this.em = em;
    }
    @Override
    public List<OrderItem> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"OrderItem\"", OrderItem.class).getResultList();
    }
}