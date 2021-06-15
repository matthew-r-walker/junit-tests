import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void isCodeupCodeUp() {
        String correct = "Codeup";
        String common = "CodeUp";

        assertNotEquals(correct, common);
    }

    @Test
    public void listsAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void arraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void stringContains() {
        String language = "PHP";


        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

}
