package classes;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class Cadastro {

    public boolean cadastroUsuario(String tipoCadastro){

        if(Objects.equals(tipoCadastro,"Aluno")){
            Scanner sc = new Scanner(System.in);
            Aluno aluno = new Aluno();

            System.out.printf("ID do %s: ",tipoCadastro);
            aluno.setId(sc.nextInt());
            sc.nextLine();

            System.out.printf("E-mail do %s: ",tipoCadastro);
            aluno.setEmail(sc.nextLine());

            System.out.printf("Nome do %s: ",tipoCadastro);
            aluno.setName(sc.nextLine());

            System.out.printf("Senha do %s: ",tipoCadastro);
            aluno.setPassword(sc.nextLine());

            System.out.printf("Telefone do %s: ",tipoCadastro);
            aluno.setTel(sc.nextLine());

            System.out.printf("Turma do %s: ",tipoCadastro);


            var turmaAluno = new Turma();
            turmaAluno.setCodeTurma(sc.nextLine());
            aluno.setTurma(turmaAluno);
            turmaAluno.getAlunos().add(aluno);

            sc.close();
            aluno.status();
        }

        else if(Objects.equals(tipoCadastro,"Professor")){
            Scanner sc = new Scanner(System.in);
            var professor = new Professor();

            System.out.printf("ID do %s: ",tipoCadastro);
            professor.setId(sc.nextInt());
            sc.nextLine();

            System.out.printf("E-mail do %s: ",tipoCadastro);
            professor.setEmail(sc.nextLine());

            System.out.printf("Nome do %s: ",tipoCadastro);
            professor.setName(sc.nextLine());

            System.out.printf("Senha do %s: ",tipoCadastro);
            professor.setPassword(sc.nextLine());

            System.out.printf("Telefone do %s: ",tipoCadastro);
            professor.setTel(sc.nextLine());

            System.out.printf("Turma do %s: ",tipoCadastro);


            var turmasProfessor = new Turma();
            turmasProfessor.setCodeTurma(sc.nextLine());

            turmasProfessor.getProfessores().add(professor);
            professor.getTurmas().add(turmasProfessor);

            sc.close();
            professor.status();
        }

    return true;
    }



}
