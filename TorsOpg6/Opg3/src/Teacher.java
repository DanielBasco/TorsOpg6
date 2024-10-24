import java.util.ArrayList;

public class Teacher extends Person {

    Teacher(String name, ArrayList<Teacher> canTeach) {
    super(name);
    }

    ArrayList<String> canTeach = new ArrayList();
    ArrayList<String> currentCourses = new ArrayList();

    @Override
    public boolean addCourse(String course) {
       if (canTeach.contains(course)) {
           currentCourses.add(course);
        return true; }
       else { return false; }
    }
}
