package com.ghenriqf.spring_estudos.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity // Indica que a classe representa uma tabela no banco de dados.
@Table(name = "alunos") // Define explicitamente o nome da tabela no banco
public class Aluno {

    @Id // Marca o atributo que será a chave primária da tabela.
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Nome não pode ser nulo")
    @Size(min = 3, max = 50,message = "Nome deve ter entre 3 e 50 caracteres")
    private String nome;

    @NotNull(message = "Idade não pode ser nulo")
    @Min(value = 4, message = "Idade mínima é 4")
    @Max(value = 20, message = "Idade máxima é 20")
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
