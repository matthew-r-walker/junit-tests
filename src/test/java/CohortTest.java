import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class CohortTest {

    private Cohort cohort;
    private Student jim;
    private Student bob;
    private Student bill;

    @Before
    public void setUp(){
        this.cohort = new Cohort();
        this.jim =  new Student(2, "Jim");
        this.bob =  new Student(1, "Bob");
        this.bill =  new Student(3, "Bill");
        bob.addGrade(70);
        bob.addGrade(75);
        bob.addGrade(80);
        jim.addGrade(20);
        jim.addGrade(30);
        jim.addGrade(40);
    }

    @Test
    public void testAddStudent() {
        assertEquals(1, cohort.getStudents().size());
        assertEquals(2, cohort.getStudents().size());
        cohort.addStudent(bill);
        assertEquals(bill, cohort.getStudents().get(2));
    }

    @Test
    public void testGetStudentsList() {
        Cohort cohort = new Cohort();
        cohort.addStudent(jim);
        cohort.addStudent(bob);
        cohort.addStudent(bill);
        assertEquals(3, cohort.getStudents().size());
        assertEquals("Jim", cohort.getStudents().get(0).getName());
    }

    @Test
    public void testGetCohortAverage() {
        cohort.addStudent(bob);
        cohort.addStudent(jim);
        assertEquals(52.5, cohort.getCohortAverage(), 0);
    }


}
