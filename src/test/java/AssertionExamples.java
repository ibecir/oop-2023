import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;
public class AssertionExamples {
    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        char[] expected = { 'J', 'u', 'p', 'i', 't', 'e', 'r' };
        char[] actual = "Jupiter".toCharArray();

        assertArrayEquals(expected, actual, "Arrays should be equal");
    }

    @Test
    void whenAssertingEquality_thenEqual() {
        float square = 2 * 2;
        float rectangle = 2 * 2;

        assertEquals(square, rectangle);
    }
    @Test
    void whenAssertingEquality_thenNotEqual() {
        float square = 2 * 2;
        float rectangle = 2 * 3;

        assertNotEquals(square, rectangle);
    }
    @Test
    void whenAssertingConditions_thenVerified() {
        assertTrue(5 > 4, "5 is greater the 4");
        assertTrue(null == null, "null is equal to null");
    }

    @Test
    public void givenBooleanSupplier_whenAssertingCondition_thenVerified() {
        BooleanSupplier condition = () -> 5 > 6;
        assertFalse(condition, "5 is not greater then 6");
    }

    @Test
    void whenAssertingNotNull_thenTrue() {
        Object dog = new Object();

        assertNotNull(dog, () -> "The dog should not be null");
    }

    @Test
    public void whenAssertingNull_thenTrue() {
        Object cat = null;

        assertNull(cat, () -> "The cat should be null");
    }

    @Test
    void whenAssertingSameObject_thenSuccessful() {
        String language = "Java";
        Optional<String> optional = Optional.of(language);
        assertSame(language, optional.get());
    }

    @Test
    void whenAssertingSameObject_thenFail() {
        String language = "Java";
        assertNotSame(language, "Java string");
    }

    @Test
    void givenMultipleAssertion_whenAssertingAll_thenOK() {
        Object obj = null;
        assertAll(
                "heading",
                () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
                () -> assertEquals("java", "JAVA".toLowerCase()),
                () -> assertNull(obj, "obj is null")
        );
    }
}
