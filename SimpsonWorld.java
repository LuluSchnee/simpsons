import java.util.ArrayList;

public class SimpsonWorld {

    private ArrayList<SimpsonPerson> personList;
    public SimpsonWorld() {
        this.personList=new ArrayList<>();
    }



    public void sendMessage(String msg, SimpsonPerson person) {
        for(SimpsonPerson p: this.personList){
            if(p != person ){
                p.receive(msg);
            }
        }
    }



    public void addPerson(SimpsonPerson person) {
            this.personList.add(person);
    }
}
