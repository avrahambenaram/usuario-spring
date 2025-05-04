package com.example.demo.model;

/**
 * UsuarioComum
 */
public class UsuarioComum implements Usuario {
  private String nome;
  private String email;
  private String cpf;
  private String telefone;
  private String endereco;

  public UsuarioComum(String nome, String email, String cpf, String telefone, String endereco) {
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;
  }

	@Override
	public String getNome() {
    return nome;
	}

	@Override
	public String getEmail() {
    return email;
	}

	@Override
	public String getCpf() {
    return cpf;
	}

	@Override
	public String getTelefone() {
    return telefone;
	}

	@Override
	public String getEndereco() {
    return endereco;
	}

  @Override
  public String getTipo() {
    return "comum";
  }

}
