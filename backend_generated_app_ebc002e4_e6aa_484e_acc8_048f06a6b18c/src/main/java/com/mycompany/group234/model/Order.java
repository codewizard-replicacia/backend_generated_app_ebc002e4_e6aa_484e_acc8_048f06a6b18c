package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.ProductType;
import com.mycompany.group234.model.Product;
import com.mycompany.group234.model.OrderItem;
import com.mycompany.group234.model.Order;
import com.mycompany.group234.model.Customer;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Order")
@Table(name = "\"Order\"", schema =  "\"generated_app\"")
@Data
                        
public class Order {
	public Order () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Order_Id\"", nullable = true )
  private Integer order_Id;
	  
  @Column(name = "\"OrderStatus\"", nullable = true )
  private String orderStatus;
  
  
  
  
   
  
  
  
  
  
	@OneToMany(mappedBy = "orderItem", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
private List<Order> order;
  
  
  
  
  @Override
  public String toString() {
	return "Order [" 
  + "Order_Id= " + order_Id  + ", " 
  + "OrderStatus= " + orderStatus 
 + "]";
	}
	
}