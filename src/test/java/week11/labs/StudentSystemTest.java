package week11.labs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class StudentSystemTest {
    static StudentSystem system;

    @BeforeEach
    void init() {
        try {
            system = new StudentSystem("students.csv");
        } catch (IOException e) {
            fail("Failed to initialize StudentSystem: " + e.getMessage());
        }
    }


    @Test
    void testifStudentisPresent() {
        assertTrue(system.students.size() > 0);
    }

    @Test
    void teststudentWithId100() {
        assertFalse(system.getStudentById(100).isPresent());
    }

    @Test
    void testStudentNull() {
        Student student = null;
        assertNull(student);
    }
    @Test
    void testHighestGPAStudent() {
        assertNotNull(system.getHighestGPAStudent());
    }

    @Test
    void testExceptionForEmptyStudentList() throws IOException {
        StudentSystem emptySystem = new StudentSystem("empty.csv");

        assertThrows(EmptyStudentListException.class,
                () -> emptySystem.getHighestGPAStudent());
    }

    @Test
    void testNamesArray() {
        String[] expectedNames = {
                "Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson"
        };

        String[] actualNames = system.students.stream()
                .map(Student::getName)
                .limit(5)
                .toArray(String[]::new);

        assertArrayEquals(expectedNames, actualNames);
    }

    @Test
    void testSize() {
        int actualSize = system.students.size();

        assertEquals(70, actualSize);
    }

    @Test
    void testLargestName() {
        Student student = system.getLongestNameStudent();
        assertNotEquals("Ava White", student);
    }

    @Test
    void testStudents() {
        Student student1 = system.getHighestGPAStudent();
        Student student2 = system.getLongestNameStudent();
        assertNotSame(student1, student2);
    }

    @Test
    void assertNotSameExample() {
        Student student1 = system.getStudentById(12).orElse(null);
        Student student2 = system.getHighestGPAStudent();

        assertSame(student1, student2);
    }
    @Test
    void assertAllExample() {
        assertAll("students",
                () -> assertEquals("Camila Wood", system.students.get(0).getName()),
                () -> assertEquals("Alexander Thompson", system.students.get(1).getName())
        );
    }
}
