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

import br.com.melqui.poo.farmaciaapi.main.Cliente;
import br.com.melqui.poo.farmaciaapi.repository.ClienteRepository;

@RestController
@RequestMapping(value ="/clientes")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable("id") Long idCliente){
        return clienteRepository.findById(idCliente);
    }

    @PostMapping
    public Cliente inserir (@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @PutMapping
    public Cliente alterar (@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @DeleteMapping(value = "/{id}")
    public void apagarPorId(@PathVariable("id") Long idCliente){
         clienteRepository.deleteById(idCliente);
    }
}
