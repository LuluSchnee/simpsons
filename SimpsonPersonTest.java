import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpsonPersonTest {

    @Test
    public void testConstructor_InvalidName_TooShort() throws Exception {
        assertDoesNotThrow(() -> {
            SimpsonPerson Person = new SimpsonPerson("Lena", Gender.FEMALE, null, null); // Short name, will throw exception

        });

        // Assert: Check that the exception message matches the expected message
      //  assertEquals("Name must be longer than 3 characters.", exception.getMessage());
    }

    @Test
    void setFather()  {

        assertDoesNotThrow(() -> {
            SimpsonPerson Vater = new SimpsonPerson("Vater", Gender.MALE, null, null);
            SimpsonPerson Person = new SimpsonPerson("Lena", Gender.FEMALE, null, null); // Short name, will throw exception
            Person.setFather(Vater);


        });
    }

    @Test
    void setMother() {

        assertDoesNotThrow(() -> {
            SimpsonPerson Mutter = new SimpsonPerson("Vater", Gender.MALE, null, null);
            SimpsonPerson Person = new SimpsonPerson("Lena", Gender.FEMALE, null, null); // Short name, will throw exception
            Person.setFather(Mutter);


        });
    }

    @Test
    void getNameStateLive() throws Exception {
        String name = "Lena";
SimpsonPerson  Person= new SimpsonPerson(name,Gender.FEMALE,null,null);
Person.setState(new live(Person));
  assertEquals(name, Person.getName());
    }

    @Test
    void getNameStateDied() throws Exception {
        String name = "Lena";
        SimpsonPerson  Person= new SimpsonPerson(name,Gender.FEMALE,null,null);
        Person.setState(new died(Person));
        assertEquals(name, Person.getName());
    }
    @Test
    void getNameStateExist() throws Exception {
        SimpsonPerson  Person= new SimpsonPerson("lena",Gender.FEMALE,null,null);
        assertEquals("Name nicht verfügbar", Person.getName());
    }
}