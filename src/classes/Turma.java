package classes;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codeTurma;
    private final int capacidadeAlunos =40;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Turma(String codeTurma, List<Aluno> alunos, List<Professor> professores) {
        this.codeTurma = codeTurma;
        this.alunos = alunos;
        this.professores = professores;
    }

    public Turma() {
    }

    public String getCodeTurma() {
        return codeTurma;
    }

    public void setCodeTurma(String codeTurma) {
        this.codeTurma = codeTurma;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}
