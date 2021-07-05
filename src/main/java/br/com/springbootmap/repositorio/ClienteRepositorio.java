package br.com.springbootmap.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springbootmap.modelo.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente,Long>{

}
