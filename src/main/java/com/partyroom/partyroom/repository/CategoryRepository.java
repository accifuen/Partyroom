package com.partyroom.partyroom.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.partyroom.partyroom.model.Category;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryRepository categoryCrudRepository;

    public List<Category> obtenerCategorias(){
        return (List<Category>) categoryCrudRepository.findAll();
    }

    private List<Category> findAll() {
        return null;
    }

    public Optional<com.partyroom.partyroom.model.Category> categoryPorId(int id){
        return categoryCrudRepository.findById(id);
    }

    private Optional<Category> findById(int id) {
        return null;
    }

    public Category categoryGuardar(Category category){
        return categoryCrudRepository.save(category);
    }

    private Category save(Category category) {
        return null;
    }
}
