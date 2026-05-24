package Q5;

public class Main {

    public static void main(String[] args) {

        Q5.Lecturer lec = new Q5.Lecturer();

        lec.setLecturerName("Mr.Kesavan Selvarajah");
        lec.setCourseTeaching("Object Oriented Programming");

        Q5.Course course = new Q5.Course();

        course.setCourseName("Java Programming");
        course.setCourseCode("CTEC 22043");
        course.setLecturer(lec);

        Q5.Student student = new Q5.Student();

        student.setStudentName("Hasini");
        student.setDegreeName("BICT");
        student.setCourseFollowing("Java Programming");


        System.out.println("----- Course Details -----");

        System.out.println("Course Name: " + course.getCourseName());

        System.out.println("Course Code: " + course.getCourseCode());

        System.out.println("Lecturer Name: " + course.getLecturer().getLecturerName());

        System.out.println("Course Teaching: " + course.getLecturer().getCourseTeaching());


        // Display Student Details
        System.out.println("\n----- Student Details -----");

        System.out.println("Student Name: " + student.getStudentName());

        System.out.println("Degree Name: " + student.getDegreeName());

        System.out.println("Course Following: " + student.getCourseFollowing());
    }
}