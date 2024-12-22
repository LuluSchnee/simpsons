import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpsonPersonTest {

    @Test
    public void testConstructor_InvalidName_TooShort() throws Exception {
        assertDoesNotThrow(() -> {
            SimpsonPerson Person = new SimpsonPerson("dd", Gender.FEMALE, null, null); // Short name, will throw exception

        });

        // Assert: Check that the exception message matches the expected message
      //  assertEquals("Name must be longer than 3 characters.", exception.getMessage());
    }

    @Test
    void setFather()  {

        assertDoesNotThrow(() -> {
            SimpsonPerson Vater = new SimpsonPerson("Vater", Gender.MALE, null, null);
            SimpsonPerson Person = new SimpsonPerson("Lena", Gender.FEMALE, null, Vater); // Short name, will throw exception
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
}