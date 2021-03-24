package com.example.demo.stock.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.stock.domain.Item;
import com.example.demo.stock.domain.ItemDto;
import com.example.demo.stock.service.ItemServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor
@RequestMapping(value="/item")
@CrossOrigin(origins ="*")
public class ItemController {
	public final ItemServiceImpl itemService;

	@GetMapping("/create")
	public ResponseEntity<?> create(@RequestBody ItemDto item){
		System.out.println("getItemFindAll()");

		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/{itemNo}")
	public ResponseEntity<Item> detail(@PathVariable(name = "itemNo") long itemNo){
		System.out.println("getItemDetail()");

		return new ResponseEntity<>(itemService.detail(itemNo), HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public ResponseEntity<Long> count(){
		System.out.println("getItemCount()");

		return new ResponseEntity<>(itemService.count(), HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<?> deleteById(@PathVariable(name = "id") long id){
		System.out.println("getItemDeleteById()");

		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Item>> findAll(){
		System.out.println("getItemFindAll()");

		return new ResponseEntity<>(itemService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/save")
	public ResponseEntity<Item> save(Item entity){
		System.out.println("getItemSave()");

		return new ResponseEntity<>(itemService.save(entity), HttpStatus.OK);
	}
	
	@GetMapping("/exist/{id}")
	public ResponseEntity<Boolean> existsById(@PathVariable(name = "id") long id){
		System.out.println("getItemExistsById()");

		return new ResponseEntity<>(itemService.existsById(id), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Item> getOne(@PathVariable(name = "id") long id){
		System.out.println("getItemOne()");

		return new ResponseEntity<>(itemService.getOne(id), HttpStatus.OK);
	}
	
	@GetMapping("/find")
	public ResponseEntity<Optional<Item>> findOne(){
		System.out.println("getItemFindOne()");

		return new ResponseEntity<>(itemService.findOne(), HttpStatus.OK);
	}

	
	
}
