public class main {
    public static void main(String[] args) throws Exception {
        //TYPECAST
        //MEDIATOR PATTERN
        // von abstracter klass kann man keine instanz bilden
        SimpsonPerson homer = new ExistSimpsonPerson("Homer", Gender.MALE);
        SimpsonPerson marsh = new ExistSimpsonPerson("Marsh", Gender.FEMALE);
        SimpsonPerson tochter = new ExistSimpsonPerson("Sina", Gender.FEMALE);

        BaseSimpsonPerson  homeralive = new AliveSimpsonPerson(homer);
        BaseSimpsonPerson  tochteralive = new AliveSimpsonPerson(tochter);
        tochteralive.setFather(homeralive);
        homeralive = new DiedSimpsonPerson(homeralive);
        tochteralive = new DiedSimpsonPerson(tochteralive);
// nicht sehr gut, da kein deconstruktor
        homer=null;

        }

    }
