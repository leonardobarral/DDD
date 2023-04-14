package ObjAluno;

import DB.DBConective;

import java.util.Scanner;
public class Aluno{
    public String nameUser;
    public String emailUser;
    public String userId;
    public String passWord;


    public static void loginAluno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("loguin!");

        System.out.print("user: ");
        String userId = sc.nextLine();

        System.out.print("password: ");
        String userPassword = sc.nextLine();

        DBConective.getConnection();
        sc.close();
    }

    public static void cadastro(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro!");

        System.out.println("name: ");
        String nameUser = sc.nextLine();

        System.out.println("e-mal: ");
        String emailUser = sc.nextLine();

        String passWord = null;
        String passwordrepeat = null;
        while( passWord == null|| passwordrepeat == null || !passWord.equals(passwordrepeat)){

            System.out.println("password: ");
            passWord = sc.nextLine();

            System.out.println("password repeat: ");
            passwordrepeat = sc.nextLine();

            if(!passWord.equals(passwordrepeat)){
                System.out.println("As senhas não são iguais.\nDigite Novamente!");

            }

        }
        if (passWord.equals(passwordrepeat)) {
            DBConective.setConnection(passWord,nameUser,emailUser);
        }
        sc.close();
    }


}
