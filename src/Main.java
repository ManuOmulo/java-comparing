public class Main {
  public static void main(String[] args) {
    Student emmanuel = new Student("Emmanuel Omulo");
    emmanuel.addSubject("Physics", "A-", 7);
    emmanuel.addSubject("Maths", "B+", 6);
    emmanuel.addSubject("Computer Studies", "A", 7);
    emmanuel.printStudentDetails();
  }
}
