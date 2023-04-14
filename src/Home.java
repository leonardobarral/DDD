import DB.DBConective;
import ObjAluno.Aluno;
import com.sun.jdi.connect.spi.Connection;
import java.util.Scanner;
import DB.DBConective;

public class Home{
    public static void main(String[] Args){

        System.out.println("Portal do ObjAluno.Aluno");
        System.out.println("1 - login\n2 - Cadastro");

        Scanner sc = new Scanner(System.in);

        int opcaoMenu = sc.nextInt();
        sc.nextLine();

        if (opcaoMenu == 1){
            Aluno.loginAluno();
        }

        else if(opcaoMenu == 2){
            Aluno.cadastro();

        }

        else{
            System.out.print("Opção inválida");
        }

        sc.close();

    }
}