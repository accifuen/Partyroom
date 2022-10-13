package com.partyroom.partyroom.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.partyroom.partyroom.model.Category;
import com.partyroom.partyroom.service.CategoryService;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins="*", methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

 
    @GetMapping("/all")
    public List<Category> obtenerListaCategorias(){
        return categoryService.obtenerCategorias();
    }

    @GetMapping("/{id}")  // {}  son variables digitarlas
    public Optional<Category> categoryById(@PathVariable("id") int categoryId){
        return categoryService.categoryPorId(categoryId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category guardarCategory(@RequestBody Category category){
        return categoryService.guardarCategory(category);
    }
}
