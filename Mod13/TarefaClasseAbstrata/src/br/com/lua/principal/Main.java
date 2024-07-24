package br.com.lua.principal;

import br.com.lua.modelo.Pessoa;
import br.com.lua.modelo.PessoaFisica;
import br.com.lua.modelo.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("Maria");
        pessoa.setEndereco("Rua A, 55");
        pessoa.setCpf(123456789L);

        PessoaJuridica empresa = new PessoaJuridica();
        empresa.setNome("Embratel");
        empresa.setEndereco("Av. b, 103");
        empresa.setCnpj(555001L);

        pessoa.imprimePessoa(pessoa);
        empresa.imprimePessoa(empresa);
    }
}