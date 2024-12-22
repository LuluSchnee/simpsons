public class SimpsonPerson implements Person{
   final String name;
    Gender gender;
   SimpsonPerson mother; // final, um nach der Initialisierung nicht mehr änderbar zu sein
   SimpsonPerson father; // final, um nach der Initialisierung nicht mehr änderbar zu sein


public SimpsonPerson(String name, Gender gender, SimpsonPerson mother, SimpsonPerson father) throws Exception {
    //runtime exception
    if(name.length()>3) {
        this.name = name;
    }else{
        throw new Exception("Exception message");
    }
    this.gender = gender;
    this.mother = mother; // Wird hier gesetzt und ist nachher unveränderlich
    this.father = father; // Wird hier gesetzt und ist nachher unveränderlich
}
public String getName() {
    return name;
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
}else{
    throw new RuntimeException("Father cant be changed");
}
    }

    public void setMother(SimpsonPerson mother) {
    if(this.mother == null) {
        this.mother = mother;
    }else{
       throw new RuntimeException("Mother cant be changed");
    }
    }
}
