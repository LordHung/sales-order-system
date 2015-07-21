/**
 * 
 */
package com.mycompany.sos.service.transformers;

import java.util.Set;

import com.mycompany.sos.dao.entities.OrderEntity;
import com.mycompany.sos.model.Order;

/**
 * OrderTransformer interface
 * 
 * @author colin
 *
 */
public interface OrderTransformer {

	Order getDtoFromEntity(OrderEntity orderEntity);
	
	OrderEntity getEntityFromDto(Order order);
	
	Set<Order> getDtoListFromEntityList(Set<OrderEntity> orderEntityList);
}