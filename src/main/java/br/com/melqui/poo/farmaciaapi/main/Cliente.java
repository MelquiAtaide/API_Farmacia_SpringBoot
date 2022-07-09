package br.com.melqui.poo.farmaciaapi.main;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    public Cliente(Long idCliente, String nome, Date nascimento, String cpf, String telefone, String email, char sexo,
            String cep, String endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.cep = cep;
        this.endereco = endereco;
    }

    public Cliente (){

    }

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Date nascimento;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private char sexo;
    
    private String cep;
    @Column(nullable = false)
    private String endereco;

    public Long getIdCliente() {
        return idCliente;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

}
