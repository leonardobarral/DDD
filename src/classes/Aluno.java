package classes;

public class Aluno extends Usuario{
    private final String ra;
    public Aluno(String ra, int id, String email, String name, String password, String tel) {
        super( id, email, name, password,tel);
        this.ra = ra;
    }

    public void status(){
        System.out.printf("Ra: %s\n",this.ra);
        System.out.printf("ID: %d\n",this.getId());
        System.out.printf("E-mail: %s\n",this.getEmail());
        System.out.printf("Nome: %s\n",this.getName());
        System.out.printf("Senha: %s\n",this.getPassword());
        System.out.printf("TEL: %s\n",this.getTel());

    }



}
