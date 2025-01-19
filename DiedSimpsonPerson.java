import java.util.ArrayList;

public class DiedSimpsonPerson implements BaseSimpsonPerson {

    String name;
    Gender gender;
    BaseSimpsonPerson mother; // final, um nach der Initialisierung nicht mehr änderbar zu sein
    BaseSimpsonPerson father; // final, um nach der Initialisierung nicht mehr änderbar zu sein
    public ArrayList<BaseSimpsonPerson> childList= new ArrayList<BaseSimpsonPerson>();
    public DiedSimpsonPerson(SimpsonPerson person) {
        if (person instanceof AliveSimpsonPerson) {
            AliveSimpsonPerson alivePerson = (AliveSimpsonPerson) person;
            this.name = alivePerson.name;
            this.gender = alivePerson.gender;
            this.mother = alivePerson.mother;
            this.father = alivePerson.father;
            this.childList = alivePerson.childList;

            if(alivePerson.father != null){
                alivePerson.father.removeChild(alivePerson);
                alivePerson.father.setChild(this);
            }
            if(alivePerson.mother!= null){
                alivePerson.mother.removeChild(alivePerson);
                alivePerson.father.setChild(this);
            }
            if(alivePerson.childList != null){

                for (BaseSimpsonPerson element : alivePerson.childList) {
                    System.out.println(element.getName());
                    if(this.gender == Gender.MALE) {
                        element.setFather(this);
                    }else{
                        element.setMother(this);
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid type for person.");
        }
    }

    public String getName() {
        return this.name;
    }


    public Gender getGender() {
        return gender;
    }

    public BaseSimpsonPerson getMother() {
        return mother;
    }
    public BaseSimpsonPerson getFather() {
        return father;
    }

    public void setFather(BaseSimpsonPerson father) {
        if(this.father==null) {
            this.father = father;
            System.out.println("Father created successfully");
        }else{
            throw new RuntimeException("Father cant be changed");
        }
    }

    public void setMother(BaseSimpsonPerson mother) {
        if(this.mother == null) {
            this.mother = mother;
            System.out.println("Mother created successfully");
        }else{
            throw new RuntimeException("Mother cant be changed");
        }
    }

    @Override
    public void setChild(BaseSimpsonPerson child) {
        childList.add(child);
    }

    public ArrayList<BaseSimpsonPerson> getChild() {
        return childList;
    }
    public void removeChild(BaseSimpsonPerson child) {
        childList.remove(child);
    }
}
