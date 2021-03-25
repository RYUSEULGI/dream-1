package com.example.demo.stock.service;

import com.example.demo.stock.domain.Item;

public interface ItemService{
	public void create(Item item);
	public Item detail(long itemNo);
}
