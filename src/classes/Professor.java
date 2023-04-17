package classes;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario{
    private final String rp = "rp";
    private List<Turma> turmas;


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
        System.out.printf("Turma: %s\n", this.turmas);

    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
