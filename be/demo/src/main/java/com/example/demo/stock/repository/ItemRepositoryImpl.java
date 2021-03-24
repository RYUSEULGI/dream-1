package com.example.demo.stock.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.stock.domain.Item;
import com.example.demo.stock.domain.ItemDto;


@Repository
public class ItemRepositoryImpl implements ItemCustomRepository {

	@Override
	public void create(ItemDto item) {
		// TODO Auto-generated method stub
	}

	@Override
	public Item read(long itemNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
