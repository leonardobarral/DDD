package classes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validador = false;

        while (!validador) {

            System.out.println("1 - Aluno\n2 - Professor");
            int opcao = sc.nextInt();

            if (opcao == 1) {
                var Cadastro = new Cadastro();
                validador = Cadastro.cadastroUsuario("Aluno");

            } else if (opcao == 2) {
                var Cadastro = new Cadastro();
                validador = Cadastro.cadastroUsuario("Professor");

            } else {
                System.out.println("Opção Inválida");

            }
        }

    }
}
