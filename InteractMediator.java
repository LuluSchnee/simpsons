import java.util.ArrayList;

public class InteractMediator implements Mediator {
    private ArrayList<SimpsonPerson> personList;
    public InteractMediator() {
        this.personList=new ArrayList<>();
    }


    @Override
    public void sendMessage(String msg, SimpsonPerson person) {
        for(SimpsonPerson p: this.personList){
            System.out.println((p.getState() instanceof live));
            //message should not be received by the user sending it
            if(p != person ){
                p.receive(msg);
            }
        }
    }



    @Override
    public void addPerson(SimpsonPerson person) {
        if(person.state instanceof live) {
            this.personList.add(person);
        }else{
            throw new RuntimeException("Person lebt oder existiert nicht");
        }
    }

    @Override
    public void removePerson(SimpsonPerson person) {
        this.personList.remove(person);
    }
}
