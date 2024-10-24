import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTest {

    @DataProvider(name = "ageTest")
    Object[][] ageDataProvider() {
        return new Object[][] {
                {10, true},
                {15, true},
                {25, false},
                {31, false},
                {13, false}
        };
    }
    @Test(dataProvider = "ageTest")
    public void personTestIsTeenager(int age, boolean expectedResult) {
        boolean result;
        result = Person.isTeenager(age);
        assertEquals(result, expectedResult);
    }

    private void assertEquals(boolean result, boolean expectedResult) {
    }
}
