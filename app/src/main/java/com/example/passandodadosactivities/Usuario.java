package com.example.passandodadosactivities;

import java.io.Serializable;

//Temos que implements Serializable para converter o obj em Bits
public class Usuario implements Serializable {

    private String nome, email;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
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
}
