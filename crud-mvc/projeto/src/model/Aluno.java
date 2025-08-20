package model;

public class Aluno {
    private final int id;
    private String nome;
    private int idade;
    private static int contador = 1000;

    public Aluno(String nome, int idade) {
        this.id = contador++;
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