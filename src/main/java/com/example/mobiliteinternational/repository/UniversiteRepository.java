package com.example.mobiliteinternational.repository;

import com.example.mobiliteinternational.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Integer> {
}




