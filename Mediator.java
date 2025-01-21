public interface Mediator {
    public void sendMessage(String msg, SimpsonPerson person);
    void addPerson(SimpsonPerson person);
   void removePerson(SimpsonPerson person);
}
