package classes;

public class Professor extends Usuario{
    private final String rp;
    public Professor(String rp, int id, String email, String name, String password, String tel) {
        super( id, email, name, password,tel);
        this.rp = rp;
    }

    public void status(){
        System.out.printf("RP: %s\n",this.rp);
        System.out.printf("ID: %d\n",this.getId());
        System.out.printf("E-mail: %s\n",this.getEmail());
        System.out.printf("Nome: %s\n",this.getName());
        System.out.printf("Senha: %s\n",this.getPassword());
        System.out.printf("TEL: %s\n",this.getTel());

    }

}
