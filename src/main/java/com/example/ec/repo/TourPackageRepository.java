package com.example.ec.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.ec.domain.TourPackage;
import java.util.Optional;


public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    /**
     * Find Tour package by name
     * @param name of the Tour Package
     * @return Optional of Tour Package
     */
    Optional<TourPackage> findByName(@Param ("name")String name );
}
