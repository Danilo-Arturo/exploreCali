package com.example.ec.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.ec.domain.Tour;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TourRepository extends CrudRepository<Tour, Integer>{
    /**
     * Find Tours associated with the Tour Package
     * @param code of tour package
     * @return list of found tours
     */
    List<Tour> findByTourPackageCode(@Param("code") String code);

}