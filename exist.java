public class exist implements State{

    private SimpsonPerson Person;
    public exist(SimpsonPerson person) {
        this.Person = person;
    }
    @Override
    public String getName() {
        throw new UnsupportedOperationException("Die Methode getName() wird nicht unterstützt.");
    }

    //destructor erstellen
}
