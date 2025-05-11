package lk.jiat.ee.ejb;



import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class StudentBean implements StudentBeanLocal {
    private static final List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
    }

    public List<String> getStudents() {
        return students;
    }
}

