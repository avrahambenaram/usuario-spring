package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Usuario;

/**
 * RepositorioUsuarios
 */
public class RepositorioUsuarios {

  private static RepositorioUsuarios repositorio;
  private final List<Usuario> usuarios;
  
  private RepositorioUsuarios() {
    this.usuarios = new ArrayList<>();
  }

  public static RepositorioUsuarios criarRepositorio() {
    if (repositorio == null) {
      repositorio = new RepositorioUsuarios();
    }
    return repositorio;
  }

  public List<Usuario> listarUsuarios() {
    return usuarios;
  }

  public void adicionar(Usuario usuario) {
    usuarios.add(usuario);
  }

  public void remover(Usuario usuario) {
    usuarios.remove(usuario);
  }
}
