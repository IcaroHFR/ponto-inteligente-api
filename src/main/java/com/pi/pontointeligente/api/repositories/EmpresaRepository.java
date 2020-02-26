package com.pi.pontointeligente.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.pi.pontointeligete.api.entities.Empresa;;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	@Transactional(readOnly= true)
	Empresa findByCnpj(String cnpj);
}
