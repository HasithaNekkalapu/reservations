package com.hasitha.reservations.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.hasitha.reservations.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}