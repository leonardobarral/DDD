package ObjProfessor;

public class Professor extends Usuario{

    //Atributos>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private final String materiaProibida = "Matemática";
    private final String nameProibido = "carlos";

    private String name;
    public String disciplina;
    private String idProfessor;


    //Gets e Sets>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getDisciplina(){
        return  this.disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }



    public String getidProfessor(){
        return this.idProfessor;
    }
    public void setidProfessor(String idProfessor){
        this.idProfessor = idProfessor;
    }


    //Validadores>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public boolean validatorName(String name){
        if (name == nameProibido){
            System.out.println("Digitou Carlos");
            return true;
        }else{
            System.out.println("Não digitou Carlos");

            System.out.println(name.getClass());
            System.out.println(nameProibido.getClass());
            return false;

        }
    }




    //Construtores>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public void constructorName(String name){
        if (name == nameProibido ){
            System.out.println("Nome Inválido");
        }
        else{
            setName(name);
        }
    }



    public void constructor(String name,String disciplina, String idProfessor, String cel ){
        setName(name);
        setDisciplina(disciplina);
        setidProfessor(idProfessor);
        setCel(cel);
    }


    public void status(){
        System.out.println("Sobre o professor");
        System.out.println(this.name);
        System.out.println(this.disciplina);
        System.out.println(this.idProfessor);
        System.out.println(this.cel);

    }





}
