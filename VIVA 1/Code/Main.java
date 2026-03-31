package Code;

public class Main {
    public static void main(String [] args){
        LectureCourse lec1 = new LectureCourse("WIA 1002","Data Structure","Dr. Zainab Malik",2);
        LectureCourse lec2 = new LectureCourse("WIA 1003","Computer System Architecture","Dr. Tey",2);
        LabCourse lab1 = new LabCourse("WIA 1006","Machine Learning","Dr. Nurul",4,8);
        LabCourse lab2 = new LabCourse("WIA 1005","Network Technology Foundation","Dr. Vincent",3,2);
        CourseManager<Course> manager = new CourseManager<>();
        manager.addCourse(lec1);
        manager.addCourse(lec2);
        manager.addCourse(lab1);
        manager.addCourse(lab2);
        System.out.print("Course with the highest total workload:\n");
        manager.getCourseWithHighestWorkload().printCourseDetails();
        System.out.println("\n-----Now sort and print all details-----");
        manager.sortCoursesByWorkload();
        manager.printAllCourses();
        if (manager.removeCourse("WIA 1006")){
            System.out.println("-----Successfully remove WIA 1006-----");
            manager.printAllCourses();
        }else{
            System.out.println("Fail to remove this course, check if this code is available!");
        }
    }
}