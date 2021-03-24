package com.example.demo.stock.service;

import com.example.demo.stock.domain.Item;
import com.example.demo.stock.domain.ItemDto;

public interface ItemService{
	public void create(ItemDto item);
	public Item detail(long itemNo);
}
