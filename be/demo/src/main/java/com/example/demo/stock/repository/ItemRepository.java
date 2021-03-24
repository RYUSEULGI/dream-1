package com.example.demo.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.stock.domain.Item;
import com.example.demo.stock.domain.ItemDto;

interface ItemCustomRepository{
	
	@Query("INSERT INTO item i SELECT * FROM 0")
	public void create(ItemDto item);
	
	@Query("SELECT * FROM item i WHERE i.item_no = :itemNo")
	public Item read(@Param("item_no") long itemNo);
}

public interface ItemRepository extends JpaRepository<Item, Long>, 
										ItemCustomRepository{
	
}
