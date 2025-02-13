/*
Doch, person in der died-Klasse ist tatsächlich eine Instanzvariable. Das bedeutet, jede Instanz
 der Klasse died besitzt ihre eigene Kopie der Variablen person. Lass uns das genauer betrachten:*/

public class died implements State {

    private SimpsonPerson person;

    public died(SimpsonPerson person) {
        this.person = person;
    }
    @Override
    public String getName() {
        return person.name;
    }
}

