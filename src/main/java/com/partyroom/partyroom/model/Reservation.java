package com.partyroom.partyroom.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="reservation")
public class Reservation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate; 
    private String status="created";

    // Muchas reservaciones para un solo room 
    @ManyToOne
    @JoinColumn(name="partyroom")
    @JsonIgnoreProperties({"reservations"})
    private partyroom partyroom;

    // Muchas reservas para un cliente 
    @ManyToOne
    @JoinColumn(name="clientId")
    @JsonIgnoreProperties({"reservations","messages"})
    private Clients client;

    private String score;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public partyroom getpartyroom() {
        return partyroom;
    }

    public void setpartyroom(partyroom partyroom) {
        this.partyroom = partyroom;
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    

   
    
}
