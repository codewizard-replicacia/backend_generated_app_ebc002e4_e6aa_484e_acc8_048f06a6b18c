package com.mycompany.group234.repository;


import com.mycompany.group234.model.Order;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class OrderRepository extends SimpleJpaRepository<Order, String> {
    private final EntityManager em;
    public OrderRepository(EntityManager em) {
        super(Order.class, em);
        this.em = em;
    }
    @Override
    public List<Order> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Order\"", Order.class).getResultList();
    }
}