package br.com.springbootmap.configuracao;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.springbootmap.modelo.Cliente;
import br.com.springbootmap.repositorio.ClienteRepositorio;

@Controller
@RequestMapping({"/cliente"})
public class ClienteControlador {
	private ClienteRepositorio clienteRepository;
	
	ClienteControlador(ClienteRepositorio clienteRepository) {
	       this.clienteRepository = clienteRepository;
	   }
	
	@GetMapping
	public List<Cliente> findAll(){
	   return clienteRepository.findAll();
	}
}
