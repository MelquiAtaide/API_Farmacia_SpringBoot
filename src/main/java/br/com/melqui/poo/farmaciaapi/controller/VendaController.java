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

import br.com.melqui.poo.farmaciaapi.main.Venda;
import br.com.melqui.poo.farmaciaapi.repository.VendaRepository;

@RestController
@RequestMapping(value ="/vendas")
public class VendaController {

    @Autowired
    VendaRepository vendaRepository;

    @GetMapping
    public List<Venda> listar(){
        return vendaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Venda> buscarPorId(@PathVariable("id") Long idVenda){
        return vendaRepository.findById(idVenda);
    }

    @PostMapping
    public Venda inserir (@RequestBody Venda venda){
        return vendaRepository.save(venda);
    }

    @PutMapping
    public Venda alterar (@RequestBody Venda venda){
        return vendaRepository.save(venda);
    }

    @DeleteMapping(value = "/{id}")
    public void apagarPorId(@PathVariable("id") Long idVenda){
        vendaRepository.deleteById(idVenda);
    }
}
