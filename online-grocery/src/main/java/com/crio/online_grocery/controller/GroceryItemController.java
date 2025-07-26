package com.crio.online_grocery.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crio.online_grocery.dto.GroceryItemDTO;
import com.crio.online_grocery.service.GroceryItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/grocery-items")
@RequiredArgsConstructor
public class GroceryItemController {
    private final GroceryItemService service;

    @PostMapping
    public ResponseEntity<GroceryItemDTO> create(@RequestBody GroceryItemDTO dto) {
        return ResponseEntity.ok(service.createGroceryItem(dto));
    }

    @GetMapping
    public List<GroceryItemDTO> getAll() {
        return service.getAllGroceryItems();
    }

}