package com.partyroom.partyroom.repository;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.partyroom.partyroom.model.Reservation;
import com.partyroom.partyroom.repository.crudrepository.ReservationCrudRepository;



@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> obtenerReservaciones() {
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    public Reservation salvarReservacion(Reservation reservation) {
        return reservationCrudRepository.save(reservation);
    }
}
