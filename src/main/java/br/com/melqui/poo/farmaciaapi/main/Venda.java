package br.com.melqui.poo.farmaciaapi.main;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenda;

    @Column
    private Date dataVenda;

    @Column(nullable = false)
    private float valor;

    @Column(nullable = false)
    private String quantidade;

    public Venda(Long idVenda, Date dataVenda, float valor, String quantidade) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Venda(){

    }

    public Long getIdVenda() {
        return idVenda;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setIdVenda(Long idVenda) {
        this.idVenda = idVenda;
    }
    
}
