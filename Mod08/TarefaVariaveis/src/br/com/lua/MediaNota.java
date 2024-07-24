package br.com.lua;
public class MediaNota {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNota_01(8.5);
        aluno.setNota_02(7.0);
        aluno.setNota_03(6.5);
        aluno.setNota_04(10);

        double media = (aluno.getNota_01() + aluno.getNota_02() + aluno.getNota_03() + aluno.getNota_04()) / 4;
        
        System.out.println("A média das notas foi: " + media);
    }
}