package br.com.springbootmap.modelo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@Data
@EntityScan
public class Cliente {
	private long codigo;
	private String pjpf;
	private String razsoc_nome;
	private String cnpj_cpf;
	private String insest_rg;
	private String tel1;
	private String tel2;
	private String email;
	private String ativprof;
	private String cep;
	private String uf;
	private String cidade;
	private String rua;
	private String num_comp;
	private String bairro;
	private String site_instagram;
	private String observacao;
}
