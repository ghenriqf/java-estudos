package model;

import java.util.Random;

public class Aluno {
    Random gerador = new Random();
    private final int id;
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.id = gerador.nextInt(100);
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public int getId() {
        return id;
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