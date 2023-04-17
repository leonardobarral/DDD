package classes;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario{
    private final String rp = "rp";
    private List<Turma> turmas = new ArrayList<>();


    public Professor(int id, String email, String name, String password, String tel, String rp, List<Turma> turmas) {
        super(id, email, name, password, tel);
        this.turmas = turmas;
    }

    public Professor(){
        super();
    }

    public void status(){
        System.out.printf("RP: %s\n",this.rp);
        System.out.printf("ID: %d\n",this.getId());
        System.out.printf("E-mail: %s\n",this.getEmail());
        System.out.printf("Nome: %s\n",this.getName());
        System.out.printf("Senha: %s\n",this.getPassword());
        System.out.printf("TEL: %s\n",this.getTel());

        final String[] listaTurmas = {turmas.get(0).getCodeTurma()};
        turmas.subList(1,turmas.size()).forEach(turma -> listaTurmas[0] += ", "+turma.getCodeTurma());

        System.out.printf("Turmas: %s\n",listaTurmas);


        //System.out.println(turmas.stream().map(turma -> + turma.getCodeTurma()).forEach(System.out::print));

        //turmas.stream().map(turma -> "Turma: " + turma.getCodeTurma()).forEach(System.out::println);

    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
