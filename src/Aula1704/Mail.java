package Aula1704;

public class Mail {
    private String remetente;
    private String texto;
    private String cc;

    public Mail(String remetente, String texto, String cc) {
        this.remetente = validarEmail(remetente);
        this.texto = texto;
        this.cc = validarEmail(cc);
    }

    public Mail() {
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = validarEmail(remetente);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = validarEmail(cc);
    }

    public String validarEmail(String email){
        if(email.matches("^[\\w.-]+@[\\w.-]+\\.[\\w]+\\.br$")){
            return email;
        }
        else{
            return null;
        }
    }


    public void status(){
        System.out.printf("Remetente: %s\n", getRemetente());
        System.out.printf("CC: %s\n", getCc());
        System.out.printf("Texto: \n%s", getTexto());

    }
}
