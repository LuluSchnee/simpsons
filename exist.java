public class exist implements State{

    private SimpsonPerson Person;
    public exist(SimpsonPerson person) {
        this.Person = person;
    }
    @Override
    public String getName() {
        throw new UnsupportedOperationException("Die Methode getName() wird nicht unterstützt.");
    }

    @Override
    public void interact(String msg, SimpsonPerson person, SimpsonWorld world) {
throw new RuntimeException("kann nicht interagiern");
    }

    @Override
    public void recieve(String msg, SimpsonPerson person) {
        throw new RuntimeException("kann nicht interagieren");
    }

    //destructor erstellen
}
