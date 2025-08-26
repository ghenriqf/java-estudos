package com.ghenriqf.spring_estudos.domain;

import jakarta.persistence.*;

@Entity // Indica que a classe representa uma tabela no banco de dados.
@Table(name = "alunos") // Define explicitamente o nome da tabela no banco
public class Aluno {

    @Id // Marca o atributo que será a chave primária da tabela.
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;

    public Aluno() {} // O JPA precisa de um construtor sem argumentos para instanciar objetos quando busca dados do banco.

    public Aluno(long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
