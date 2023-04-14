package classes;

public class Usuario extends Senha{

    private final int id;
    private final String email;
    private final String name;
    private final String tel;

    public Usuario(int id, String email, String name, String password, String tel) {
        super(password);
        this.id = id;
        this.email = email;
        this.name = name;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
}

