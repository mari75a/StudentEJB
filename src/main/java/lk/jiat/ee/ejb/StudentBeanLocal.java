package lk.jiat.ee.ejb;





import jakarta.ejb.Local;
import java.util.List;

@Local
public interface StudentBeanLocal {
    void addStudent(String name);
    List<String> getStudents();
}


