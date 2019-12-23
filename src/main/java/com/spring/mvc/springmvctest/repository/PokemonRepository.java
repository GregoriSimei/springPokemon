package com.spring.mvc.springmvctest.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.mvc.springmvctest.entity.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, Long> {

}
