//25k-3044
public class Course {
    String CourseCode;
    String CourseName;
    int CreditHours;
    public Course(String code, String name, int credit)
    {
        this.CourseCode=code;
        this.CourseName=name;
        this.CreditHours=credit;
    }
    void display()
    {
        System.out.println("COURSE CODE: "+ CourseCode+ " COURSE NAME: "+ CourseName+ " CREDIT HOURS: "+CreditHours);
    }
}
class COURSES {
    public static void main(String[] args) {
        Course c1 = new Course("EE101", "DLD", 2);
        Course c2 = new Course("CS120", "OOP", 3);
        System.out.println("College Course List:");
        c1.display();
        c2.display();
    }
}