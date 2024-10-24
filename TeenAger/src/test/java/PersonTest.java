import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.AssertJUnit.assertEquals;

public class PersonTest {
    public void currentTime () {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
    @BeforeClass
    void beforeClass () {
        System.out.println("Test Start");
    }
    @AfterClass
    void afterClass () {
        System.out.println("Test Finish");
    }
    @DataProvider (name = "isTeenager")
    Object [][] dataProvider () {
        return new Object[][]{
                {0, false},
                {5, false},
                {10, false},
                {13, true},
                {15, true},
                {19, true},
                {20, false},
                {25, false},
                {30, false},


        };
    }
    @Test(dataProvider = "isTeenager")
    public void personIsTeenager (int age, boolean expected) {
        boolean result = Person.isTeenager (age);
        System.out.println("Для возраста " + age + ": " + "Результат: " + result + " / " + "Ожидаемый результат: " + expected);
        assertEquals(result, expected);
    }

}