package com.example.veiculoapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.veiculoapplication.veiculos.Caminhao;
import com.example.veiculoapplication.veiculos.CarroEsportivo;

@Controller
@RequestMapping("/veiculos")
public class VeiculoController {

  private CarroEsportivo carroEsportivo = new CarroEsportivo("Ferrari");
  private Caminhao caminhao = new Caminhao("Scania");

  @GetMapping
  public String getVeiculos(Model model) {
    model.addAttribute("velocidadeCarro", carroEsportivo.getVelocidade());
    model.addAttribute("marchaCarro", carroEsportivo.getMarcha());
    model.addAttribute("velocidadeCaminhao", caminhao.getVelocidade());
    model.addAttribute("marchaCaminhao", caminhao.getMarcha());
    return "index";
  }

  @PostMapping("/acelerarCarro")
  public String acelerarCarro(Model model) {
    carroEsportivo.aumentarVelocidade();
    model.addAttribute("velocidadeCarro", carroEsportivo.getVelocidade());
    model.addAttribute("marchaCarro", carroEsportivo.getMarcha());
    return "redirect:/veiculos";
  }

  @PostMapping("/freiarCarro")
  public String freiarCarro(Model model) {
    carroEsportivo.diminuirVelocidade();
    model.addAttribute("velocidadeCarro", carroEsportivo.getVelocidade());
    model.addAttribute("marchaCarro", carroEsportivo.getMarcha());
    return "redirect:/veiculos";
  }

  @PostMapping("/acelerarCaminhao")
  public String acelerarCaminhao(Model model) {
    caminhao.aumentarVelocidade();
    model.addAttribute("velocidadeCaminhao", caminhao.getVelocidade());
    model.addAttribute("marchaCaminhao", caminhao.getMarcha());
    return "redirect:/veiculos";
  }

  @PostMapping("/freiarCaminhao")
  public String freiarCaminhao(Model model) {
    caminhao.diminuirVelocidade();
    model.addAttribute("velocidadeCaminhao", caminhao.getVelocidade());
    model.addAttribute("marchaCaminhao", caminhao.getMarcha());
    return "redirect:/veiculos";
  }
}