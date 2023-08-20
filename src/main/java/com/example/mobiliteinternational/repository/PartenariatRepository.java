package com.example.mobiliteinternational.repository;


import com.example.mobiliteinternational.entity.Partenariat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PartenariatRepository extends JpaRepository<Partenariat, Integer> {
}


