import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {


    private Student bob;
    private Student jim;
    private Student bill;

    @Before
    public void setUp() {
        this.bob = new Student("Bob", 1);
        this.bill = new Student("Bill", 4);
        this.jim = new Student("Jim", 2);
    }


    @Test
    public void studentConstructorTest() {
        assertEquals(1, bob.getId());
        assertEquals("Bob", bob.getName());
        assertTrue(bob.getGrades().isEmpty());
    }

    @Test
    public void studentIdTest() {
        assertEquals(1, bob.getId());
        assertEquals(2, jim.getId());
    }

    @Test
    public void studentNameTest() {
        assertEquals("Bob", bob.getName());
        assertEquals("Bill", bill.getName());
    }

    @Test
    public void studentAddGradeTest() {
        bob.addGrade(80);
        bob.addGrade(73);
        bob.addGrade(85);
        assertEquals(3, bob.getGrades().size());

        bob.addGrade(87);
        assertEquals(4, bob.getGrades().size());

        bill.addGrade(74);
        assertEquals(1, bill.getGrades().size());

    }

    @Test
    public void studentGetGradesTest() {
        assertEquals(0, bob.getGrades().size());
        bob.addGrade(60);
        assertEquals(1, bob.getGrades().size());
    }

    @Test
    public void studentGetGradeAverageTest() {
        bob.addGrade(80);
        bob.addGrade(85);
        bob.addGrade(90);
        assertEquals(85, bob.getGradeAverage(), 0);
        bob.addGrade(10);
        assertEquals(66.25, bob.getGradeAverage(), 0);
    }



}
