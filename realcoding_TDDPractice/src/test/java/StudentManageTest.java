import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;


public class StudentManageTest {

    @Test
    public void creatStudent(){
        Student student = new Student();
        student.setName("홍길동");
        assertThat(student.getName(),is("홍길동"));
    }

    @Test
    public void addStudent(){
        List<Student> students = new ArrayList();
        Student student = new Student();
        student.setName("김철수");
        students.add(student);
        hasItemInArray(student);
    }

    @Test
    public void callStudent(){
        Student student = new Student();
        when(student.getName()).thenReturn("홍길동");
        assertTrue("홍길동".equals(student.getName()));
    }

    @Test
    public void callNum(){
        Student student = new Student();
        student.setName("홍길동");
        verify(student,times(1)).setName("홍길동");
    }

    @Test
    public void addStudentNumber(){
        Student student = new Student();
        student.setNumber("201502099");
        assertThat(student.getNumber(),is("201502099"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void iffindnullnumber(){

        Student student= new Student();
        student.setName("이현준");
        assertThat(student.getNumber(),is("201502099"));


    }
    @Test(expected = IllegalArgumentException.class)
    public void iffindnullnum(){

        Student student= new Student();
        student.setNumber("201502099");
        assertThat(student.getName(),is("이현준"));


    }
}