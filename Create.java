public class Create {
    public static void main(String[] args) throws Exception {

        // von abstracter klass kann man keine instanz bilden
        Mediator interact = new InteractMediator();
        SimpsonPerson Homer = new SimpsonPerson("Homer", Gender.MALE, null, null, interact);
        SimpsonPerson Marsh = new SimpsonPerson("Marsh", Gender.FEMALE, null, null, interact);
        SimpsonPerson Tochter = new SimpsonPerson("Sina", Gender.FEMALE, null, null, interact);

        Homer.setState(new live(Homer));
        Tochter.setState(new live(Tochter));
        interact.addPerson(Homer);
        interact.addPerson(Tochter);
        Tochter.sendMessage("hallo test");
        }

    }
