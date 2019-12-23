package com.spring.mvc.springmvctest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.springmvctest.entity.Pokemon;
import com.spring.mvc.springmvctest.service.PokemonService;

@CrossOrigin
@RestController
@RequestMapping("/pokemon")
public class PokemonController 
{

	@Autowired
	private PokemonService pokemonService;
	
	
	@GetMapping
	public Iterable<Pokemon> obterTodos()
	{
		return pokemonService.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Pokemon obterPorId(@PathVariable Long id)
	{
		return pokemonService.obterPorId(id);
	}
	
	@PostMapping
	public Pokemon criarPokemon(@RequestBody Pokemon pokemon)
	{
		return pokemonService.criarPokemon(pokemon);
	}
	
	@DeleteMapping("/{id}")
	public String deletarPokemon(@PathVariable Long id)
	{
		return pokemonService.deletarPokemon(id)? "Pokemon removido com sucesso" : "Erro ao remover Pokemon !";
	}
	
	@PutMapping
	public String atualizarPokemon(@RequestBody Pokemon pokemon)
	{
		return pokemonService.atualizarPokemon(pokemon)? "Atualizado com sucesso !" : "Erro ao atualizar";
	}
	
}
