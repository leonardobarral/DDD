package classes;

public class Aluno extends Usuario{
    private final String ra = "ra";
    private Turma turma;


    public Aluno( int id, String email, String name, String password, String tel, Turma turma) {
        super( id, email, name, password,tel);
        this.turma = turma;
    }

    public Aluno() {
        super();
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void status(){
        System.out.printf("Ra: %s\n",this.ra);
        System.out.printf("ID: %d\n",this.getId());
        System.out.printf("E-mail: %s\n",this.getEmail());
        System.out.printf("Nome: %s\n",this.getName());
        System.out.printf("Senha: %s\n",this.getPassword());
        System.out.printf("TEL: %s\n",this.getTel());
        System.out.printf("Turma: %s\n",this.getTurma().getCodeTurma());


    }



}
