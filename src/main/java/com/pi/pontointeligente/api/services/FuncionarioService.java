package com.pi.pontointeligente.api.services;

import java.util.Optional;

import com.pi.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	
	/**
	 * Persiste o funcionario
	 * 
	 * @param funcionario
	 * @return
	 */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca o funcionario dado um cpf
	 * 
	 * @param cpf
	 * @return
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca o funcionario dado um email
	 * 
	 * @param email
	 * @return
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Busca o funcionario dado um id
	 * 
	 * @param id
	 * @return
	 */
	Optional<Funcionario> buscarPorId(Long id);
}
