package classes;
import java.util.Objects;
import java.util.Scanner;
public class Cadastro {
    public boolean cadastroUsuario(String tipoCadastro) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("ID do %s: ",tipoCadastro);
        int id = sc.nextInt();
        sc.nextLine();

        System.out.printf("E-mail do %s: ",tipoCadastro);
        String email = sc.nextLine();

        System.out.printf("Nome do %s: ",tipoCadastro);
        String name = sc.nextLine();

        System.out.printf("Senha do %s: ",tipoCadastro);
        String password = sc.nextLine();

        System.out.printf("Telefone do %s: ",tipoCadastro);
        String tel = sc.nextLine();
        sc.close();

        if(Objects.equals(tipoCadastro,"Aluno")){
            Aluno aluno = new Aluno("ra", id, email, name, password, tel);
            aluno.status();
        }else if(Objects.equals(tipoCadastro,"Professor")){
            var professor = new Professor("rp", id, email, name, password, tel);
            professor.status();
        }
        return true;

    }

}
