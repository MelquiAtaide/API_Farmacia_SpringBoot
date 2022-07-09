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

import br.com.melqui.poo.farmaciaapi.main.Produto;
import br.com.melqui.poo.farmaciaapi.repository.ProdutoRepository;

@RestController
@RequestMapping(value ="/produtos")
public class ProdutoController {
    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listar(){
        return produtoRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Produto> buscarPorId(@PathVariable("id") Long idProduto){
        return produtoRepository.findById(idProduto);
    }

    @PostMapping
    public Produto inserir (@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @PutMapping
    public Produto alterar (@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping(value = "/{id}")
    public void apagarPorId(@PathVariable("id") Long idProduto){
        produtoRepository.deleteById(idProduto);
    }
}
