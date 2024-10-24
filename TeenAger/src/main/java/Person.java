public class Person {
    public static boolean isTeenager(int age)
    {
        boolean result;
        if (age >= 13 && 19 >= age) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}