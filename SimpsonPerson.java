public class SimpsonPerson implements Person{
    String name;
    Gender gender;
    SimpsonPerson mother;
    SimpsonPerson father;

public SimpsonPerson(String name, Gender gender) {
    //runtime exception
    this.name = name;
    this.gender = gender;
}
public String getName() {
    return name;
}

public String getGender() {
    return gender.getDescription();
}

public SimpsonPerson getMother() {
    return mother;
}
public SimpsonPerson getFather() {
    return father;
}
}
