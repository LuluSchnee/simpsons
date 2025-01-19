import java.util.ArrayList;

public class AliveSimpsonPerson implements BaseSimpsonPerson{

     String name;
    Gender gender;
    BaseSimpsonPerson mother; // final, um nach der Initialisierung nicht mehr änderbar zu sein
    BaseSimpsonPerson father; // final, um nach der Initialisierung nicht mehr änderbar zu sein
public ArrayList<BaseSimpsonPerson> childList= new ArrayList<BaseSimpsonPerson>();
    public AliveSimpsonPerson(SimpsonPerson person) {
        if (person instanceof ExistSimpsonPerson) {
            ExistSimpsonPerson existPerson = (ExistSimpsonPerson) person;
            this.name = existPerson.name;
            this.gender = existPerson.gender;
            this.mother = existPerson.mother;
            this.father = existPerson.father;
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
        System.out.println(father);
        if(this.father==null  ) {

            this.father = father;
            System.out.println("dsfjsdklkf");
            this.father.setChild(this);
            System.out.println("Father created successfully");
        } else if (father instanceof DiedSimpsonPerson && father.getChild().contains(this)) {
            this.father.removeChild(this);
            this.father = father;
            System.out.println("dsfjsdklkf");
            this.father.setChild(this);
            System.out.println("Father created successfully");
        } else
        {
            throw new RuntimeException("Father cant be changed");
        }
    }

    public void setMother(BaseSimpsonPerson mother) {
        if(this.mother == null) {
            this.mother = mother;
            System.out.println("Mother created successfully");
            this.mother.setChild(this);
        }
        else if (mother instanceof DiedSimpsonPerson && mother.getChild().contains(this)) {
            this.getMother().removeChild(this);
            this.mother = mother;
            System.out.println("dsfjsdklkf");
            this.mother.setChild(this);
            System.out.println("Mother created successfully");
        }else{
            throw new RuntimeException("Mother cant be changed");
        }
    }



    @Override
    public void setChild(BaseSimpsonPerson child) {
    childList.add(child);
    }

    public void removeChild(BaseSimpsonPerson child) {
        childList.remove(child);
    }

public ArrayList<BaseSimpsonPerson> getChild() {
        return childList;
}
}
