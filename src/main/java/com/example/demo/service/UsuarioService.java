package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.RepositorioUsuarios;

/**
 * UsuarioService
 */
@Service
public class UsuarioService {
  
  private final RepositorioUsuarios repositorio = RepositorioUsuarios.criarRepositorio();

  public void cadastrarUsuario(Usuario usuario) throws Exception {
    Usuario cpfJaUsado = repositorio.encontrarPorCpf(usuario.getCpf());
    if (cpfJaUsado != null) {
      throw new Exception("CPF já utilizado");
    }
    repositorio.adicionar(usuario);
  }

  public List<Usuario> listarUsuarios() {
    return repositorio.listarUsuarios();
  }

  public void deletar(Usuario usuario) {
    repositorio.remover(usuario);
  }
}
