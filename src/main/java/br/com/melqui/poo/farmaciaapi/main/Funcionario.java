package br.com.melqui.poo.farmaciaapi.main;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionario;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    private Date nascimento;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private char sexo;

    private String cep;
    @Column(nullable = false)
    private  String endereco;
    @Column(nullable = false)
    private String cargo;
    @Column(nullable = false)
    private float salario;

    public Funcionario(Long idFuncionario, String nome, String cpf, Date nascimento, String telefone, String email,
            char sexo, String cep, String endereco, String cargo, float salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.cep = cep;
        this.endereco = endereco;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario (){
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
}
