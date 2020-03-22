package com.pi.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.pi.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {
	
	/**
	 * Persiste o lançamento
	 * @param lancamento
	 * @return
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 * Busca pelo Id do funcionario
	 * @param funcionarioId
	 * @param pageRequest
	 * @return
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);
	
	/**
	 * Busca pelo Id
	 * @param id
	 * @return
	 */
	Optional<Lancamento> buscaPorId(Long id);
	
	/**
	 * Remove pelo Id
	 * @param id
	 */
	void remover(Long id);
}
