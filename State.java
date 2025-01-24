public interface State {
    public String getName();
    public void interact(String msg, SimpsonPerson person,SimpsonWorld world);
    public void recieve(String msg, SimpsonPerson person);
}