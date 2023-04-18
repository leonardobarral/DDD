package Aula1704;

public class app {
    public static void main(String[] Args){
        var email = new Mail();

        email.setRemetente("Leonardobarral@gmail.com.br");
        email.setCc("Leonardo.barral@portoseguro.com.br");
        email.setTexto("Olá, tudo bem, contigo?\nEstou passando para lhe desejar um bom dia!!\n\nAbraços!!\n--\nLeonardo Barral");
        email.status();

    }


}
