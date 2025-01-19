public class ExistSimpsonPerson implements SimpsonPerson {
    final String name;
    Gender gender;
    BaseSimpsonPerson mother; // final, um nach der Initialisierung nicht mehr änderbar zu sein
    BaseSimpsonPerson father; // final, um nach der Initialisierung nicht mehr änderbar zu sein

    //strategy pattern, bridge pattern anschauen
    public ExistSimpsonPerson(String name, Gender gender) throws Exception {
        //runtime exception
        if(name==null || name.length()>3) {
            this.name = name;
        }else{
            throw new Exception("Name must be longer than 3 characters.");
        }
        this.gender = gender;

    }



}
