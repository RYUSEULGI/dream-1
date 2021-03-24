package com.example.demo.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.stock.domain.Item;

interface ItemCustomRepository2{}

public interface ItemRepository2 extends JpaRepository<Item, Long>,
											ItemCustomRepository2{
	@Query(value = "SELECT * FROM item i WHERE i.item_no = :itemNo", nativeQuery = true)
	public Item detail(@Param("itemNo") Long itemNo);
	
	@Query(value = "INSERT INTO item i SELECT * FROM 0", nativeQuery = true)
	public Item detail(long itemNo);
}
