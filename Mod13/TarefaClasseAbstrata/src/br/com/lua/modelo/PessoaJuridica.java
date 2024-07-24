package br.com.lua.modelo;

public class PessoaJuridica extends Pessoa {
    private Long cnpj;

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}
