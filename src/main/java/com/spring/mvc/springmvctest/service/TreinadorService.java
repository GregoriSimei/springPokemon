package com.spring.mvc.springmvctest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.springmvctest.entity.Treinador;
import com.spring.mvc.springmvctest.repository.TreinadorRepository;

@Service
public class TreinadorService 
{
	
	@Autowired
	private TreinadorRepository treinadorRepository;

	public Iterable<Treinador> obterTodos()
	{
		
		return treinadorRepository.findAll();
		
	}

	public Treinador criarTreinador(Treinador treinador) {
		return treinadorRepository.save(treinador);
	}

	public Treinador obterPorId(Long id) {
		
		Optional<Treinador> optionalTreinador = treinadorRepository.findById(id);
		
		return optionalTreinador.orElseThrow(() -> new RuntimeException("Treinador não existe !"));

	}

	public boolean deletarTreinador(Long id) 
	{
		boolean resp = false;
		
		try 
		{
			treinadorRepository.deleteById(id);
			resp = true;
		} 
		catch (Exception e) {
			resp = false;
		}
		
		return resp;
	}

	public boolean atualizarTreinador(Treinador treinador) 
	{
		boolean resp = false;
		
		try 
		{
			treinadorRepository.save(treinador);
			resp = true;
		} 
		catch (Exception e) 
		{
			resp = false;
		}
		return resp;
	}
}
