package com.rafaelsahyounrosa.ebac_demo.controllers;

import com.rafaelsahyounrosa.ebac_demo.entidades.Animal;
import com.rafaelsahyounrosa.ebac_demo.interfaces.RelatorioFuncionariosInterface;
import com.rafaelsahyounrosa.ebac_demo.repositorios.AnimalRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping
    private List<Animal> findAll(){
      return animalRepository.findAll();
    }

    @PostMapping
    private Animal save(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return animalRepository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return animalRepository.findAdopted();
    }

    @GetMapping("/relatorio-funcionarios")
    private List<RelatorioFuncionariosInterface> findRelatorioFuncionarios(
            @RequestParam(name = "dataMinima") LocalDate dataMinima,
            @RequestParam(name = "dataMaxima") LocalDate dataMaxima) {
        return animalRepository.relatorioFuncionariosAnimaisRegatados(dataMinima, dataMaxima);
    }
}
