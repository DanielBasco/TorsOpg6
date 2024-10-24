import java.util.ArrayList;

public class Student extends Person {


    Student(String name, ArrayList<Student> passedCourses) {
        super(name);
    }

    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return true;
        } else {
            currentCourses.add(course);
            return false;
        }
    }
}
