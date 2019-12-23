package com.spring.mvc.springmvctest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.springmvctest.entity.Treinador;

@Repository
public interface TreinadorRepository extends CrudRepository<Treinador, Long>{

}
