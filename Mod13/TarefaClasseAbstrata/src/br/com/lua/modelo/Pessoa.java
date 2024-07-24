package br.com.lua.modelo;

public abstract class Pessoa {
    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void imprimePessoa(Pessoa pessoa) {
        System.out.println("Tipo pessoa: " +getClass().getSimpleName());
        System.out.println("Nome: " +getNome());
        System.out.println("Endereço: " +getEndereco());
    }
}
