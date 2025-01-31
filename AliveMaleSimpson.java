public class AliveMaleSimpson implements Alive,MaleSimpsonPerson{
    String name;
    FemaleSimpsonPerson mother; // final, um nach der Initialisierung nicht mehr änderbar zu sein
    MaleSimpsonPerson father; // final, um nach der Initialisierung nicht mehr änderbar zu sein

    //strategy pattern, bridge pattern anschauen
    public AliveMaleSimpson(UnbornMaleSimpson Person) throws Exception {
        //runtime exception



            if (name == null || name.length() > 3) {
                this.name = Person.name;
            } else {
                throw new Exception("Name must be longer than 3 characters.");
            }

    }



    public SimpsonPerson getMother() {
        return mother;
    }
    public SimpsonPerson getFather() {
        return father;
    }

    public void setFather(DeadMaleSimpson father) {
        if(this.father==null) {
            this.father = father;

            System.out.println("Father created successfully");
        }else{
            throw new RuntimeException("Father cant be changed");
        }
    }


    public void setFather(AliveMaleSimpson father) {
        if(this.father==null) {
            this.father = father;

                    System.out.println("Father created successfully");
        }else{
            throw new RuntimeException("Father cant be changed");
        }
    }

    public void setMother(FemaleSimpsonPerson mother) {
        if(this.mother == null) {
            this.mother = mother;
            System.out.println("Mother created successfully");
        }else{
            throw new RuntimeException("Mother cant be changed");
        }
    }


    @Override
    public String getName() {
        return name;
    }
}
