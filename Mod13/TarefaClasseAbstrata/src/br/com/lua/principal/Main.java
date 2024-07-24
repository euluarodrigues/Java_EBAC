package br.com.lua.principal;

import br.com.lua.modelo.PessoaFisica;
import br.com.lua.modelo.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setNome("Maria");
        pessoa1.setEndereco("Rua A, 55");
        pessoa1.setCpf(123456789L);

        PessoaJuridica empresa1 = new PessoaJuridica();
        empresa1.setNome("Embratel");
        empresa1.setEndereco("Av. b, 103");
        empresa1.setCnpj(555001L);

        pessoa1.imprimePessoa(pessoa1);
        empresa1.imprimePessoa(empresa1);
    }
}