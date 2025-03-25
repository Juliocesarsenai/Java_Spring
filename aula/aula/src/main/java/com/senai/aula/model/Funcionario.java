package com.senai.aula.model;

import jakarta.persistence.*;

@Entity
@Table(name="funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNascimento;
    private double salario;
    private String telefone;
    private String email;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cpf, String rg, String dataNascimento, String matricula, double salario, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome:" + nome +
                ", cpf:" + cpf  +
                ", rg:" + rg +
                ", matricula:" + matricula  +
                ", dataNascimento:" + dataNascimento +
                ", salario:" + salario +
                ", telefone:" +
                ", email:" + email;
    }
}
