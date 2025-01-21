public class SimpsonPerson implements Person{
   final String name;
    Gender gender;
     SimpsonPerson mother; // final, um nach der Initialisierung nicht mehr änderbar zu sein
    SimpsonPerson father; // final, um nach der Initialisierung nicht mehr änderbar zu sein
    State state;
    protected Mediator mediator;
//strategy pattern, bridge pattern anschauen
public SimpsonPerson(String name, Gender gender, SimpsonPerson mother, SimpsonPerson father,Mediator mediator) throws Exception {
    //runtime exception
    if(name==null || name.length()>3) {
        this.name = name;
    }else{
        throw new Exception("Name must be longer than 3 characters.");
    }
    this.mediator=mediator;
    setState(new exist(this));
    this.gender = gender;
    this.mother = mother; // Wird hier gesetzt und ist nachher unveränderlich
    this.father = father; // Wird hier gesetzt und ist nachher unveränderlich
}

public void setState(State state) {
    if(this.state instanceof exist && state instanceof live || this.state instanceof live && state instanceof died || this.state==null) {
        this.state = state;
        if(this.state instanceof exist) {
            this.mediator.removePerson(this);
        }

    }

}
public String getName() {
  return state.getName();
}
public State getState() {
    return state;
}
public Gender getGender() {
    return gender;
}

public SimpsonPerson getMother() {
    return mother;
}
public SimpsonPerson getFather() {
    return father;
}

    public void setFather(SimpsonPerson father) {
if(this.father==null) {
    this.father = father;
    System.out.println("Father created successfully");
}else{
    throw new RuntimeException("Father cant be changed");
}
    }

    public void setMother(SimpsonPerson mother) {
    if(this.mother == null) {
        this.mother = mother;
        System.out.println("Mother created successfully");
    }else{
       throw new RuntimeException("Mother cant be changed");
    }
    }

    public void sendMessage(String msg) {
        if (this.state instanceof live) {
            System.out.println(this.name + ": Sending Message=" + msg);
            mediator.sendMessage(msg, this);
        } else {
            throw new UnsupportedOperationException("Du bist tot oder nichtgeboren und kannst deswegen keine nachrichten versenden.");
        }


}
    public void receive(String msg){
        System.out.println(this.name + ": Received Message:" + msg);
    }
}
