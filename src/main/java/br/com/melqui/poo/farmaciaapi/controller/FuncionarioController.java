package br.com.melqui.poo.farmaciaapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.melqui.poo.farmaciaapi.main.Funcionario;
import br.com.melqui.poo.farmaciaapi.repository.FuncionarioRepository;

@RestController
@RequestMapping(value ="/funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> listar(){
        return funcionarioRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Funcionario> buscarPorId(@PathVariable("id") Long idFuncionario){
        return funcionarioRepository.findById(idFuncionario);
    }

    @PostMapping
    public Funcionario inserir (@RequestBody Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    @PutMapping
    public Funcionario alterar (@RequestBody Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    @DeleteMapping(value = "/{id}")
    public void apagarPorId(@PathVariable("id") Long idFuncionario){
        funcionarioRepository.deleteById(idFuncionario);
    }
}