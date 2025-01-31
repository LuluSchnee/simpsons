public class UnbornMaleSimpson implements MaleSimpsonPerson,Unborn{
    String name;
    SimpsonPerson mother; // final, um nach der Initialisierung nicht mehr änderbar zu sein
    SimpsonPerson father; // final, um nach der Initialisierung nicht mehr änderbar zu sein

    //strategy pattern, bridge pattern anschauen
    public UnbornMaleSimpson(String name) throws Exception {
        //runtime exception
        if(name==null || name.length()>3) {
            this.name = name;
        }else{
            throw new Exception("Name must be longer than 3 characters.");
        }

    }

}
