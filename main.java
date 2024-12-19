public class main {
    public static void main(String[] args) {
        GenderFemale female = new GenderFemale();
        // von abstracter klass kann man keine instanz bilden
        SimpsonPerson Homer = new SimpsonPerson("Homer", female);
System.out.println(Homer.getName());
        }

    }
