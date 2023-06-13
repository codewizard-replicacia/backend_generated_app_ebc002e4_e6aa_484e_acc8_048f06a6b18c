package com.mycompany.group234.function;

import com.mycompany.group234.model.ProductType;
import com.mycompany.group234.model.Product;
import com.mycompany.group234.model.OrderItem;
import com.mycompany.group234.model.Order;
import com.mycompany.group234.model.Customer;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.mycompany.group234.repository.OrderRepository;
import com.mycompany.group234.repository.CustomerRepository;
import com.mycompany.group234.repository.OrderItemRepository;
import com.mycompany.group234.repository.ProductTypeRepository;
import com.mycompany.group234.repository.ProductRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
