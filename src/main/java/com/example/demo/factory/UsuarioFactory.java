package com.example.demo.factory;

import com.example.demo.model.BuilderUsuario;
import com.example.demo.model.Usuario;

/**
 * UsuarioFactory
 */
public abstract class UsuarioFactory {

  abstract Usuario criarUsuario(BuilderUsuario builder);
  
}
