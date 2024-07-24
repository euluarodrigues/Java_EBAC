import java.util.Scanner;
public class MediaNota {
        public static void main(String[] args) {
            System.out.println("\n#### Sistema de notas do aluno ####\n");
            SwitchNotas();
        }
        public static void SwitchNotas() {
            int prova = 0;
            Aluno aluno = new Aluno();
            try (Scanner s = new Scanner(System.in)) {
                while (prova < 4) {
                    prova ++;
                    System.out.print("Informe a nota da " + prova + "ª prova: ");
                    switch (prova) {
                        case 1:
                            aluno.setNota_01(s.nextDouble());
                            continue;
                        case 2:
                            aluno.setNota_02(s.nextDouble());
                            continue;
                        case 3:
                            aluno.setNota_03(s.nextDouble());
                            continue;
                        default:
                            aluno.setNota_04(s.nextDouble());
                            continue;
                    }
                }
            }
        double avgNota = (aluno.getNota_01() + aluno.getNota_02() + aluno.getNota_03() + aluno.getNota_04()) /4;
        if (avgNota >= 7.0) {
            System.out.println("\nMédia: " + String.format("%.2f", avgNota) + ". Aluno aprovado!\n");
        } else if (avgNota >= 5.0) {
            System.out.println("\nMédia: " + String.format("%.2f", avgNota) + ". Aluno em recuperação!\n");
        } else {
            System.out.println("\nMédia: " + String.format("%.2f", avgNota) + ". Aluno reprovado!\n");
        }
    }
}