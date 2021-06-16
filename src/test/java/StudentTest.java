import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {

        Student student;

    @Before
    public void setUp() {
        this.student = new Student("Bob", 1);
    }


    @Test
    public void studentConstructorTest() {
        assertEquals(1, student.getId());
        assertEquals("Bob", student.getName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void studentIdTest() {
        assertEquals(1, student.getId());
        Student jim  = new Student("Jim", 2);
        assertEquals(2, jim.getId());
    }

    @Test
    public void studentNameTest() {
        assertEquals("Bob", student.getName());
        Student bill = new Student("Bill", 4);
        assertEquals("Bill", bill.getName());
    }

    @Test
    public void studentAddGradeTest() {
        student.addGrade(80);
        student.addGrade(73);
        student.addGrade(85);

        assertEquals(3, student.getGrades().size());
        student.addGrade(87);
        assertEquals(4, student.getGrades().size());
        Student bill = new Student("Bill", 4);
        bill.addGrade(74);
        assertEquals(1, bill.getGrades().size());

    }

    @Test
    public void studentGetGradesTest() {
        assertEquals(0, student.getGrades().size());
        student.addGrade(60);
        assertEquals(1, student.getGrades().size());
    }

    @Test
    public void studentGetGradeAverageTest() {
        student.addGrade(80);
        student.addGrade(85);
        student.addGrade(90);
        assertEquals(85, student.getGradeAverage(), 0);
        student.addGrade(10);
        assertEquals(66.25, student.getGradeAverage(), 0);
    }



}
