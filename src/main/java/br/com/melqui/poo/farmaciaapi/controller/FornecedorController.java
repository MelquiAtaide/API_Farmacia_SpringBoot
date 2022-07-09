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

import br.com.melqui.poo.farmaciaapi.main.Fornecedor;
import br.com.melqui.poo.farmaciaapi.repository.FornecedorRepository;

@RestController
@RequestMapping(value ="/fornecedores")
public class FornecedorController {
    
    @Autowired
    FornecedorRepository fornecedorRepository;

    @GetMapping
    public List<Fornecedor> listar(){
        return fornecedorRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Fornecedor> buscarPorId(@PathVariable("id") Long idFornecedor){
        return fornecedorRepository.findById(idFornecedor);
    }

    @PostMapping
    public Fornecedor inserir (@RequestBody Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    @PutMapping
    public Fornecedor alterar (@RequestBody Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    @DeleteMapping(value = "/{id}")
    public void apagarPorId(@PathVariable("id") Long idFornecedor){
        fornecedorRepository.deleteById(idFornecedor);
    }

}
