package hbcu.stay.ready;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import hbcu.stay.ready.animals.Dog;
import hbcu.stay.ready.animals.Animal;
import hbcu.stay.ready.animals.Mammal;

import java.util.Date;


public class DogTest {
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // Given (dog data)
    String givenName;
    Date givenBirthDate;
    Integer givenId;
    Dog dog;

    @Before
    public void initialize() {
        givenName = "Peanut";
        givenBirthDate = new Date();
        givenId = 0;
        // Given (a name exists and a dog exists)
        dog = new Dog(givenName, givenBirthDate, givenId);
    }

    @Test
    public void constructorTest() {
         // When (we retrieve data from the cat)
         String retrievedName = dog.getName();
         Date retrievedBirthDate = dog.getBirthDate();
         Integer retrievedId = dog.getId();
 
         // Then (we expect the given data, to match the retrieved data)
         Assert.assertEquals("checking name", givenName, retrievedName);
         Assert.assertEquals("checking birthdate", givenBirthDate, retrievedBirthDate);
         Assert.assertEquals("checking id", givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals("setting name", dogName, givenName);
    }

    @Test
    public void speakTest() {
        String expectedVal = "bark!";

        String actualVal = dog.speak();

        Assert.assertEquals("testing dog speak", expectedVal, actualVal);
    }

    @Test
    public void testEat() {
        // given
        int expectedNumMeals = 1;
        Food ramen = new Food();

        // when
        dog.eat(ramen);
        int actualNumMeals = dog.getNumberOfMealsEaten();

        //then
        Assert.assertEquals("testing whether arraylist in dog gets updated in size after eating something", expectedNumMeals, actualNumMeals);
    }    

    @Test
    public void getIdTest() {
        // given
        int expectedId = 0;

        // when
        int actualId = dog.getId();

        //then
        Assert.assertEquals("testing dog id", expectedId, actualId);
    }   

    @Test
    public void instanceOfAnimalTest() {
        boolean expectedAns = true;

        boolean actualAns = dog instanceof Animal;

        Assert.assertEquals("tests whether dog is an instance of Animal", expectedAns, actualAns);
    }

    @Test
    public void instanceOfMammalTest() {
        boolean expectedAns = true;

        boolean actualAns = dog instanceof Mammal;

        Assert.assertEquals("tests whether dog is an instance of Mammal", expectedAns, actualAns);
    }

    @After
    public void resetData() {
        dog.setName(givenName);
        dog.setBirthDate(givenBirthDate);
        //can't set id
    }
    
}
