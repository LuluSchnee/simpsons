import java.util.ArrayList;

public class Create {
    public static void main(String[] args) throws Exception {

    MaleSimpsonPerson Homer= new UnbornMaleSimpson("Homer");
    MaleSimpsonPerson Alex= new UnbornMaleSimpson("Alex");
    Alex = new AliveMaleSimpson((UnbornMaleSimpson)Alex);
    Homer = new AliveMaleSimpson((UnbornMaleSimpson)Homer);
    ArrayList <SimpsonPerson> list = new ArrayList<>();
    list.add(Alex);
    ((AliveMaleSimpson) Homer).setFather((AliveMaleSimpson) Alex);
    System.out.println(((AliveMaleSimpson)((AliveMaleSimpson) Homer).getFather()).getName());
    Alex = new DeadMaleSimpson((AliveMaleSimpson) Alex);
        list.add(Alex);
    System.out.println(list);
    System.out.println(((AliveMaleSimpson) Homer).getFather());
    System.out.println((Alex));

        }

    }
