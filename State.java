public interface State {
    public String getName();
    public void interact(String msg, SimpsonPerson person);
    public void recieve(String msg, SimpsonPerson person);
}