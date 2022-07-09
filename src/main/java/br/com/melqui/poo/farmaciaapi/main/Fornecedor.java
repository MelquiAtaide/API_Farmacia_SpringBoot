package br.com.melqui.poo.farmaciaapi.main;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Fornecedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFornecedor;

    @Column(nullable = false)
    private String nome;
    @Column(unique = true, nullable = false)
    private String cnpj;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
 
    private String cep;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String quantidade;
    @Column(nullable = false)
    private String diaEntrega;

    @OneToMany
    private List<Produto> produto;

    public Fornecedor(Long idFornecedor, String nome, String cnpj, String telefone, String email, String cep,
            String endereco, String quantidade, String diaEntrega) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
        this.quantidade = quantidade;
        this.diaEntrega = diaEntrega;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Fornecedor(){

    }

    public Long getIdFornecedor() {
        return idFornecedor;
    }

    public String getDiaEntrega() {
        return diaEntrega;
    }

    public void setDiaEntrega(String diaEntrega) {
        this.diaEntrega = diaEntrega;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
}
