package com.crio.online_grocery.service;

import java.util.List;

import com.crio.online_grocery.dto.GroceryItemDTO;

public interface GroceryItemService {
    GroceryItemDTO createGroceryItem(GroceryItemDTO dto);
    List<GroceryItemDTO> getAllGroceryItems();
}
