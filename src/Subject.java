public class Subject {
  private String name;
  private String grade;
  private int hours;

  public Subject(String name, String grade, int hours) {
    this.name = name;
    this.grade = grade;
    this.hours = hours;
  }

  public String getName() {
    return name;
  }

  public String getGrade() {
    return grade;
  }

  public int getHours() {
    return hours;
  }

  public double getGradePoints() {
    return (double) hours * getMatchingPoint(grade);
  }

  private double getMatchingPoint(String grade) {
    return switch (grade) {
      case "A" -> 4.0;
      case "A-" -> 3.7;
      case "B+" -> 3.3;
      case "B" -> 3.0;
      case "B-" -> 2.7;
      case "C+" -> 2.3;
      case "C" -> 2.0;
      case "C-" -> 1.7;
      case "D+" -> 1.3;
      case "D" -> 1.0;
      case "D-" -> 0.7;
      default -> 0.0;
    };
  }
}
