package Code;
import java.util.ArrayList;

public class CourseManager<T extends Course>{
    private ArrayList<T> manager=new ArrayList<>();

    public void addCourse (T course){
        manager.add(course);
    }

    public boolean removeCourse(String courseCode){
        for (T course: manager){
            if (course.getCourseCode().equals(courseCode)){
                manager.remove(course);
                return true;
            }
        }
        return false;
    }

    public T getCourseWithHighestWorkload(){
        int max=0;
        for (int i=0; i<manager.size(); i++){
            if (manager.get(i).calculateTotalWorkload()>manager.get(max).calculateTotalWorkload()){
                max=i;
            }
        }
        return (manager.get(max));
    }

    public void sortCoursesByWorkload(){
        int len = manager.size();
        for (int i=0; i<len-1;i++){
            for (int j=0; j<len-i-1;j++){
                if (manager.get(j).calculateTotalWorkload()>manager.get(j+1).calculateTotalWorkload()){
                    T temp = manager.get(j);
                    manager.set(j, manager.get(j+1));
                    manager.set(j+1, temp);
                }
            }
        }
    }

    public void printAllCourses(){
        for (T course: manager){
            course.printCourseDetails();
            System.out.println();
        }
    }
}