public class exist implements State{

    private SimpsonPerson Person;
    public exist(SimpsonPerson person) {
        this.Person = person;
    }
    @Override
    public String getName() {
        return "Name nicht verfügbar";
    }

    //destructor erstellen
}
