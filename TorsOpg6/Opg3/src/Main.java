import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Opretter 3 studerende
        Student S1 = new Student("Asger", new ArrayList<>());
        S1.setName("Asger");
        S1.passedCourses.add("Java 1.0");
        S1.passedCourses.add("Python 3.0");

        Student S2 = new Student("Daniel", new ArrayList<>());
        S2.setName("Daniel");
        S2.passedCourses.add("Java 1.0");
        S2.passedCourses.add("Python 3.0");

        Student S3 = new Student ("André", new ArrayList<>());
        S3.setName("André");
        S3.passedCourses.add("C++");
        S3.passedCourses.add("Python 3.0");

        //Opretter 3 lærere
        Teacher T1 = new Teacher("Tine", new ArrayList<>());
        T1.setName("Tine");
        T1.canTeach.add("C++");
        T1.canTeach.add("Sketch");

        Teacher T2 = new Teacher("Signe", new ArrayList<>());
        T2.setName("Signe");
        T2.canTeach.add("Python 3.0");
        T2.canTeach.add("Java 1.0");

        Teacher T3 = new Teacher("Stig", new ArrayList<>());
        T3.setName("Stig");
        T3.canTeach.add("Python 3.0");
        T3.canTeach.add("HTML");
        T3.canTeach.add("CSS");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(S1);
        persons.add(S2);
        persons.add(S3);
        persons.add(T1);
        persons.add(T2);
        persons.add(T3);

        for (Person p : persons) {
            if(p instanceof Student) {
                if (p.addCourse("Java 1.0")) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus");
                } else {
                    System.out.println(p.getName() + " har ikke bestået eller lært dette");
                }
            }

           if(p instanceof Teacher){
               if(p.addCourse("Java 1.0")) {
                   System.out.println(p.getName()+" kan godt undervise i dette");
               } else {
                   System.out.println(p.getName()+" har ikke lært dette");
               }
           }
        }
    }
}
