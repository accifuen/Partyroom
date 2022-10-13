package com.partyroom.partyroom.repository.crudrepository;

import org.springframework.data.repository.CrudRepository;

import com.partyroom.partyroom.model.Category;

public interface CategoryCrudRepository extends CrudRepository <Category,Integer>{
    
}
