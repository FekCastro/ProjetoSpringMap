package br.com.springbootmap.configuracao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(path = "/encontrar_todos_clientes")
	public List<Cliente> findAll(){
	   return clienteRepository.findAll();
	}
	@GetMapping(path = "/encontrar_todos_clientes_map")
	public Map<Integer,Cliente> findAllMap(){
		
		List<Cliente> listaCliente = clienteRepository.findAll();
		Map<Integer,Cliente> clienteMap = new HashMap<Integer,Cliente>();

		for (Cliente cliente : listaCliente) {
			clienteMap.put(cliente.getCodigo(), cliente);
		}
		
	   return clienteMap;
	}
	
	@PutMapping(path = "/cadastro")
	public Cliente saveCliente(Cliente cliente){
	   return clienteRepository.save(cliente);
	}
	
	@DeleteMapping(path = "/deletarcliete")
	public void deleteCliente(Cliente cliente) {
		clienteRepository.delete(cliente);
	}
}
