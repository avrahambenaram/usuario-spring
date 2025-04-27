package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class UsuarioController {

  @GetMapping
  public String teste() {
    return "Teste";
  }
    // @GetMapping("/cadastro")
    // public String mostrarFormulario(Model model) {
    //     model.addAttribute("usuario", new Usuario());
    //     return "cadastro"; // Thymeleaf procura templates/cadastro.html
    // }
    //
    // @PostMapping("/usuarios")
    // public String cadastrarUsuario(@ModelAttribute Usuario usuario) {
    //     RepositorioUsuarios.getInstance().adicionarUsuario(usuario);
    //     return "redirect:/usuarios";
    // }
    //
    // @GetMapping("/usuarios")
    // public String listarUsuarios(Model model) {
    //     model.addAttribute("usuarios", RepositorioUsuarios.getInstance().getUsuarios());
    //     return "usuarios";
    // }
}

