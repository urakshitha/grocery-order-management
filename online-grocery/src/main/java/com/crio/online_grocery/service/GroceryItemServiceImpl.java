package com.crio.online_grocery.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.crio.online_grocery.dto.GroceryItemDTO;
import com.crio.online_grocery.dtoMapper.DTOMapper;
import com.crio.online_grocery.entity.GroceryItem;
import com.crio.online_grocery.repository.GroceryItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GroceryItemServiceImpl implements GroceryItemService {
    private final GroceryItemRepository repo;
    private final DTOMapper mapper;

    @Override
    public GroceryItemDTO createGroceryItem(GroceryItemDTO dto) {
        GroceryItem item = mapper.toGroceryItemEntity(dto);
        return mapper.toGroceryItemDTO(repo.save(item));
    }

    @Override
    public List<GroceryItemDTO> getAllGroceryItems() {
        return repo.findAll().stream()
                .map(mapper::toGroceryItemDTO)
                .collect(Collectors.toList());
    }
}
