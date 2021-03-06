package com.pi.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.pi.pontointeligente.api.entities.Lancamento;
import com.pi.pontointeligente.api.repositories.LancamentoRepository;
import com.pi.pontointeligente.api.services.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService{
	
	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistindo lancamento {}",lancamento);
		lancamentoRepository.save(lancamento);
		return null;
	}

	public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
		log.info("Buscando lancamento pelo funcionario id: {}",funcionarioId);
		return lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
	}

	public Optional<Lancamento> buscaPorId(Long id) {
		log.info("Buscando lancamento pelo id: {}",id);
		return this.lancamentoRepository.findById(id);
	}

	public void remover(Long id) {
		log.info("Removendo lancamento pelo id: {}",id);
		lancamentoRepository.deleteById(id);
	}

}
