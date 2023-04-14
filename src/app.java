import ObjProfessor.Professor;
import java.util.Scanner;


public class app {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        var andrezao = new Professor();

        boolean teste = true;
        while(teste){
            System.out.print("Nome do Professor: ");
            String name = sc.next();
            teste = andrezao.validatorName(name);
        }




        //andrezao.constructorName(name);
        //andrezao.constructor(name,"Matemática","aysfiui1333", "11985375309");
        andrezao.status();
    }
}
