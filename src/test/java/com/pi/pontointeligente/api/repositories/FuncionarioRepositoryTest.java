package com.pi.pontointeligente.api.repositories;


import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

//import com.ip.pontointeligente.api.repositories.EmpresaRepository;
//import com.ip.pontointeligente.api.repositories.FuncionarioRepository;
//import com.pi.pontointeligete.api.entities.Funcionario;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class FuncionarioRepositoryTest {
	
//	@Autowired
//	private FuncionarioRepository funcionarioRepository;
	
//	@Autowired
//	private EmpresaRepository empresaRepository;
	
//	private static final String EMAIL = "caro.henrique1997@gmail.com";
	//private static final String CPF = "60931865395";
	
	@After
	public final void tearDown() {
//		this.empresaRepository.deleteAll();
	}
	
	@Test
	public void testBuscarFuncionarioPorEmail() {
	//	Funcionario funcionario = this.funcionarioRepository.findByEmail(EMAIL);
		
	}
	
}
