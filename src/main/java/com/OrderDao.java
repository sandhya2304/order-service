package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;




@Repository
public class OrderDao 
{
	
	public List<Order> getOrders()
	{
		
        return Stream.of(
        		new Order(1,"clothes",20000, 45000),
        		new Order(2,"furniture",70000, 45000),
        		new Order(3,"home",6, 1665000),
        		new Order(4,"job",1, 45000),
        		new Order(5,"happiness",20000, 45000))
        		.collect(Collectors.toList());
	
	}
	
	

}
