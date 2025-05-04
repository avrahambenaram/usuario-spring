package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.controller.dto.CriarUsuarioDto;
import com.example.demo.factory.UsuarioAdministradorFactory;
import com.example.demo.factory.UsuarioComumFactory;
import com.example.demo.factory.UsuarioFactory;
import com.example.demo.model.BuilderUsuario;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

  private final UsuarioService usuarioService;

  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  @GetMapping("/novo")
  public String cadastro() {
    return "cadastro";
  }

  @GetMapping
  public String listar(Model model) {
    model.addAttribute("usuarios", usuarioService.listarUsuarios());
    return "listar";
  }

  @PostMapping
  public String cadastrarUsuario(@ModelAttribute CriarUsuarioDto dto) {
    try {

      BuilderUsuario builder = new BuilderUsuario(dto.nome(), dto.email(), dto.cpf());
      builder.setTelefone(dto.telefone());
      builder.setEndereco(dto.endereco());

      System.out.println(dto);
      UsuarioFactory factory = dto.tipo().equals("admin")
        ? new UsuarioAdministradorFactory()
        : new UsuarioComumFactory();

      Usuario usuario = factory.criarUsuario(builder);

      usuarioService.cadastrarUsuario(usuario);
      return "redirect:/usuarios";

    } catch (Exception err) {
      System.out.println(err);
      return "redirect:/usuarios";
    }
  }
    //
    // @GetMapping("/usuarios")
    // public String listarUsuarios(Model model) {
    //     model.addAttribute("usuarios", RepositorioUsuarios.getInstance().getUsuarios());
    //     return "usuarios";
    // }
}

