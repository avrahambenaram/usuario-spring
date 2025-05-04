package com.example.demo.factory;

import com.example.demo.model.BuilderUsuario;
import com.example.demo.model.Usuario;

/**
 * UsuarioFactory
 */
public abstract class UsuarioFactory {

  public abstract Usuario criarUsuario(BuilderUsuario builder);
  
}
