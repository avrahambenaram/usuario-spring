package com.example.demo.model;

/**
 * BuilderUsuario
 */
public class BuilderUsuario {
  private String nome;
  private String email;
  private String cpf;
  private String telefone;
  private String endereco;

  public BuilderUsuario(String cpf) {
    this.cpf = cpf;
  }

  public BuilderUsuario setNome(String nome) {
    this.nome = nome;
    return this;
  }

  public BuilderUsuario setEmail(String email) {
    this.email = email;
    return this;
  }

  public BuilderUsuario setCpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  public BuilderUsuario setTelefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  public BuilderUsuario setEndereco(String endereco) {
    this.endereco = endereco;
    return this;
  }

  public UsuarioComum buildComum() {
    return new UsuarioComum(nome, email, cpf, telefone, endereco);
  }

  public UsuarioAdministrador buildAdministrador() {
    return new UsuarioAdministrador(nome, email, cpf, telefone, endereco);
  }
}
