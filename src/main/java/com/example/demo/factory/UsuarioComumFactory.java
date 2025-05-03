package com.example.demo.factory;

import com.example.demo.model.BuilderUsuario;
import com.example.demo.model.Usuario;

/**
 * UsuarioComumFactory
 */
public class UsuarioComumFactory extends UsuarioFactory {

  @Override
  public Usuario criarUsuario(BuilderUsuario builder) {
    return builder.buildComum();
  }
  
}
