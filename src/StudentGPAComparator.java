import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {
  @Override
  public int compare(Student s1, Student s2) {
    return (s1.getGpa() + s1.getName()).compareTo(s2.getGpa() + s2.getName());
  }
}
