package com.senai.aula.model;


import jakarta.persistence.*;

@Entity
@Table(name="usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @OneToOne(cascade=CascadeType.ALL)
    private Endereco endereco;


    @Column(nullable = false)
    private String nome;
    private String email;
    private String senha;
    private String telefone;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String senha, String telefone,Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco=endereco;
    }

    public Long getId() {
        return id;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(){
        this.endereco=endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id: " + id +
                "nome: '" + nome + '\'' +
                "email: '" + email + '\'' +
                "senha: '" + senha + '\'' +
                "telefone: '" + telefone + '\'' +
                '}';
    }
}
