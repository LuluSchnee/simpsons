public class live implements State{
    private SimpsonPerson person;

    public live(SimpsonPerson person) {
        this.person = person;
    }
    @Override
    public String getName() {
        return person.name;
    }
}
