import java.util.ArrayList;
import java.util.List;

public class Student {
  private String name;
  private int id;
  private static int INITIAL_ID = 1001;
  private List<Subject> subjects = new ArrayList<>();

  public Student(String name) {
    this.name = name;
    this.id = INITIAL_ID++;
  }

  public void addSubject(String name, String grade, int hoursTaken) {
    Subject subject = new Subject(name, grade, hoursTaken);
    subjects.add(subject);
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    double totalGradePoints = 0;
    double totalHours = 0;

    for (Subject subject : subjects) {
      totalGradePoints +=  subject.getGradePoints();
      totalHours += subject.getHours();
    }

    return totalGradePoints / totalHours;
  }

  private void getSubjects() {
    for (Subject subject : subjects) {
      System.out.printf("%s - %s(%.2f GP)\n", subject.getName(), subject.getGrade(), subject.getGradePoints());
    }
  }

  public void printStudentDetails() {
    System.out.printf("""
        (ID %d) %s has a %.2f GPA and was taking these classes:
        """, id, name, getGpa()
    );
    getSubjects();
    System.out.println();
  }
}
