public class Create {
    public static void main(String[] args) throws Exception {

        // von abstracter klass kann man keine instanz bilden
        SimpsonWorld conversation = new SimpsonWorld();
        SimpsonPerson Homer = new SimpsonPerson("Homer", Gender.MALE, null, null);
        SimpsonPerson Marsh = new SimpsonPerson("Marsh", Gender.FEMALE, null, null);
        SimpsonPerson Tochter = new SimpsonPerson("Sina", Gender.FEMALE, null, null);

        Tochter.setState(new live(Tochter));

       conversation.addPerson(Tochter);
       conversation.addPerson(Homer);
       Homer.setState(new live(Homer));
       Tochter.interact("hadkljfdaslf",Tochter, conversation);

   //     System.out.println(Tochter.getName());
        System.out.println(Tochter.getGender());
        }

    }
