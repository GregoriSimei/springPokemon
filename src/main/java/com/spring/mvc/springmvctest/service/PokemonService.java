package com.spring.mvc.springmvctest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.springmvctest.entity.Pokemon;
import com.spring.mvc.springmvctest.repository.PokemonRepository;

@Service
public class PokemonService
{

	@Autowired
	private PokemonRepository pokemonRepository;

	public Iterable<Pokemon> obterTodos()
	{
		
		return pokemonRepository.findAll();
		
	}

	public Pokemon criarPokemon(Pokemon pokemon) {
		return pokemonRepository.save(pokemon);
	}

	public Pokemon obterPorId(Long id) {
		
		Optional<Pokemon> optionalPokemon = pokemonRepository.findById(id);
		
		return optionalPokemon.orElseThrow(() -> new RuntimeException("Pokemon não existe !"));

	}

	public boolean deletarPokemon(Long id) 
	{
		boolean resp = false;
		
		try 
		{
			pokemonRepository.deleteById(id);
			resp = true;
		} 
		catch (Exception e) {
			resp = false;
		}
		
		return resp;
	}

	public boolean atualizarPokemon(Pokemon pokemon) 
	{
		boolean resp = false;
		
		try 
		{
			pokemonRepository.save(pokemon);
			resp = true;
		} 
		catch (Exception e) 
		{
			resp = false;
		}
		return resp;
	}
	
	
	
}
