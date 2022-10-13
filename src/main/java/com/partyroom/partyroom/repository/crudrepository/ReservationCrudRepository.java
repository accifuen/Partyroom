package com.partyroom.partyroom.repository.crudrepository;



import org.springframework.data.repository.CrudRepository;

import com.partyroom.partyroom.model.Reservation;



public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer>{
    
}
