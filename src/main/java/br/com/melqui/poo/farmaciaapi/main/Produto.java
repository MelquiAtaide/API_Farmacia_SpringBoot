package br.com.melqui.poo.farmaciaapi.main;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String fabricante;

    @Column(nullable = false)
    private Date validade;

    @Column(nullable = false)
    private float preco;

    @OneToOne
    private Fornecedor fornecedor;

    public Produto(Long idProduto, String nome, String tipo, String fabricante, Date validade, float preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.validade = validade;
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto(){
        
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    
}
