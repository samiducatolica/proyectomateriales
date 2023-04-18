package com.hotels.mart.infrastructure.jpa.repositories;

import org.springframework.stereotype.Repository;

import com.hotels.mart.domain.entities.Reservation;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    /**AQUI LOGICA */
}
