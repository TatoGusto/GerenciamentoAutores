package com.oatw.GerenciamentoAutores.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_autor")
public class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "CodigoAutor")
    private UUID id;
    private String nome;
    @Column(name = "País de origem")
    private String nacionalidade;
    private LocalDate dataNascimento;

    public AutorModel() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
