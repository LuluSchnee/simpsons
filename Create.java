public class Create {
    public static void main(String[] args) throws Exception {

        // von abstracter klass kann man keine instanz bilden
        SimpsonPerson Homer = new SimpsonPerson("Homer", Gender.MALE, null, null);
        SimpsonPerson Marsh = new SimpsonPerson("Marsh", Gender.FEMALE, null, null);
        SimpsonPerson Tochter = new SimpsonPerson("Sina", Gender.FEMALE, null, null);

        Tochter.setFather(Homer);
        Tochter.setState(new live(Tochter));
  //      Tochter.setState(new died(Tochter));
       System.out.println(Tochter.getState());
        System.out.println(Tochter.getName());
        System.out.println(Tochter.getGender());
        }

    }
