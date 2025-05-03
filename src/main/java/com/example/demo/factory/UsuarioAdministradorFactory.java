package com.example.demo.factory;

import com.example.demo.model.BuilderUsuario;
import com.example.demo.model.Usuario;

/**
 * UsuarioAdministradorFactory
 */
public class UsuarioAdministradorFactory extends UsuarioFactory {

  @Override
  public Usuario criarUsuario(BuilderUsuario builder) {
    return builder.buildAdministrador();
  }
  
}
