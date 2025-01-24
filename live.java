public class live implements State{
    private SimpsonPerson person;

    public live(SimpsonPerson person) {
        this.person = person;
    }
    @Override
    public String getName() {
        return person.name;
    }

    @Override
    public void interact(String msg, SimpsonPerson person) {
        System.out.println(person.name + ": Sending Message=" + msg);
        person.world.sendMessage(msg, person);
    }

    @Override
    public void recieve(String msg, SimpsonPerson person) {
        System.out.println(person.name + ": Received Message:" + msg);
    }
}
