import java.util.ArrayList;
import java.util.List;


public class Student {

    List<Student> students = new ArrayList();
    private String name;
    private String number;
    private String gender;

    public String getName() {
        if (name==null){
            throw new IllegalArgumentException();
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        if (number==null){
            throw new IllegalArgumentException();
        }
        return this.number;
    }

    public void setGender(String gender) { this.gender = gender; }
    public String getGender(){
        if(gender == null) {
            throw new IllegalArgumentException();
        }
        return this.gender;
    }
    public void addStudent(){
        Student student = new Student();
        student.setName("김철수");
        students.add(student);
    }

}
