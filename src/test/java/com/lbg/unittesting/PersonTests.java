package com.lbg.unittesting;
import com.lgb.unittesting.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.MatcherAssert.*;

public class PersonTests {
    @Test
    public void testGetFullName(){
        // Triple 'A' pattern
        // Arrange
        Person p1 = new Person("Bob", "Bobson");
        // Act
        String name = p1.getFullName();
        // Assert
        assertEquals("Bob Bobson", name);
    }
    @Test
    public void testAddDoubles(){
        Person p1 = new Person("Bob", "Bobson");
        double result = p1.add(0.2, 0.1);
//        assertEquals(0.3, result);
//        assertEquals(0.3, result, 0.03);
        assertThat(0.3, closeTo(result, 0.03));
    }

}
