package domain;
/**
 * Esta classe define o objeto aluno, com as propriedades nota 01, nota 02, nota 03 e nota 04, e métodos getters e setters para cada.
 * @author lua.rodrigues
 */
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String curso;
    private Double nota;
    
    public Aluno(String nome, String curso, Double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.getNome());
    }
}