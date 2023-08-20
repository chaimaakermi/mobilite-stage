package com.example.mobiliteinternational.repository;

import com.example.mobiliteinternational.entity.MobiliteInternational;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MobiliteInternationalRepository extends JpaRepository<MobiliteInternational,Integer> {

}