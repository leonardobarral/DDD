package classes;

public class Usuario extends Senha{

    private int id;
    private String email;
    private String name;
    private String tel;

    public Usuario(int id, String email, String name, String password, String tel) {
        super(password);
        this.id = id;
        this.email = email;
        this.name = name;
        this.tel = tel;
    }
    public Usuario(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

