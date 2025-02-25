package br.com.lua;
/**
 * Esta classe define o objeto cliente, com as propriedades codigo, nome e endereço e métodos getters e setters para cada.
 * @author lua.rodrigues
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
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
}