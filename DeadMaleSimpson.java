public class DeadMaleSimpson implements  Dead, MaleSimpsonPerson{

    String name;
    FemaleSimpsonPerson mother; // final, um nach der Initialisierung nicht mehr änderbar zu sein
    MaleSimpsonPerson father; // final, um nach der Initialisierung nicht mehr änderbar zu sein

    //strategy pattern, bridge pattern anschauen
    public DeadMaleSimpson(AliveMaleSimpson Person) throws Exception {
        //runtime exception

        if (name == null || name.length() > 3) {
            this.name = Person.name;
        } else {
            throw new Exception("Name must be longer than 3 characters.");
        }
        this.father = Person.father;
        this.mother = Person.mother;

    }


    @Override
    public String getName() {
        return name;
    }
}
