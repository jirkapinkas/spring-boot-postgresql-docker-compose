package com.example.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Item;
import com.example.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Transactional
	@PostConstruct
	public void init() {
		itemRepository.save(new Item(1, "A"));
		itemRepository.save(new Item(2, "B"));
		itemRepository.save(new Item(3, "C"));
	}
	
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

}
