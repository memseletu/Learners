import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {
    Person person;

    @BeforeEach
    public void setUpBeforeEach(){
        person = new Person();
    }

//    @BeforeAll
//    public static void setUpBeforeAll(){
//        System.out.println(" ");
//    }
    @Test
    public void setNameTest(){
        //given

        String expected = "John";
        //when
        person.setName("John");
        //then
        Assertions.assertEquals(expected, person.getName());
    }
    @Test
    public void addnameTest(){
        //given
      int expected = 1;


        //when
        person.addName("Mem");

        //then
        Assertions.assertEquals(expected, person.getSizeList());
    }
    @Test
    public void removeNametest(){
        //given
        int expected = 1;
        //when
        person.addName("same");
        person.removeName("same");
        //then
        Assertions.assertEquals(expected, person.getSizeList());
    }
    @Test
    public void sameTest(){
        Assertions.assertSame(person.same1, person.same2);
    }
}
