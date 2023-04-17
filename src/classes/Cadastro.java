package classes;
import java.util.*;

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

            //aluno.setTurma(new Turma());

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


            System.out.printf("Número de turmas do professor %s: ",tipoCadastro);
            int numTurmas = sc.nextInt();
            sc.nextLine();

            for (var i = 0; i < numTurmas ;i++){
                System.out.printf("Turma do %d: ", i+1);
                var novaturma = new Turma();
                novaturma.setCodeTurma(sc.nextLine());
                professor.getTurmas().add(novaturma);
                novaturma.getProfessores().add(professor);

            }


            /**
            System.out.printf("Turma do %s: ",tipoCadastro);


            var novaturma = new Turma();
            novaturma.setCodeTurma(sc.nextLine());
            professor.getTurmas().add(novaturma);
            novaturma.getProfessores().add(professor);
            */
            sc.close();
            professor.status();
        }

    return true;
    }



}
