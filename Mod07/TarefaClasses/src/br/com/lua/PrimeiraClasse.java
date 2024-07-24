package br.com.lua;
public class PrimeiraClasse {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá");
        Cliente cliente = new Cliente();
        cliente.setEndereco("Rua Antonia, 255");
        cliente.setCodigo(22);
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCodigo());
    }
}