package com.vinnissaum.dscatalog.services;

import com.vinnissaum.dscatalog.dto.CategoryDTO;
import com.vinnissaum.dscatalog.entities.Category;
import com.vinnissaum.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();

        return list.stream().map(CategoryDTO::new).toList();
    }
}
