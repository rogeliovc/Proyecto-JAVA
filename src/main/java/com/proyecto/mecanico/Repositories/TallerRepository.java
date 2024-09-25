package com.proyecto.mecanico.Repositories;

import com.proyecto.mecanico.Models.TallerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface TallerRepository extends CrudRepository<TallerModel, Long> {

    Optional<ArrayList<TallerModel>> findCarModelByPlate(String plate);
    Optional<ArrayList<TallerModel>> findCarModelByName(String name);

}
