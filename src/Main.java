import java.util.Arrays;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    Student emmanuel = new Student("Emmanuel Omulo");
    emmanuel.addSubject("Physics", "A-", 7);
    emmanuel.addSubject("Maths", "B+", 6);
    emmanuel.addSubject("Computer Studies", "A", 7);
    emmanuel.printStudentDetails();

    Student mary = new Student("MaryBeth Akinyi");
    mary.addSubject("Biology", "B+", 7);
    mary.addSubject("Kiswahili", "A-", 5);
    mary.addSubject("English", "A-", 5);
    mary.addSubject("Design", "B", 6);
    mary.printStudentDetails();

    rankStudents(mary, emmanuel);
  }

  public static void rankStudents(Student... students) {
    Comparator<Student> gpaSorter = new StudentGPAComparator();
    Arrays.sort(students, gpaSorter.reversed());

    System.out.println("-".repeat(50));
    System.out.println("Sorted list of students by grade");
    System.out.println("-".repeat(50));

    for (Student student : students) {
      System.out.printf("%s (%.2f)\n", student.getName(), student.getGpa());
    }

    System.out.println("-".repeat(50));
  }
}
