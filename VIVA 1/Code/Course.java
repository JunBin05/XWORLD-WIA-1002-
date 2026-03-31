package Code;

public interface Course{
    /**
     * Retrieves the unique identification code for the course (e.g., WIX1002).
     * @return A string representing the course code.
     */
    public String getCourseCode();

    /**
     * Retrieves the official title of the course (e.g., Fundamentals of Programming).
     * @return A string representing the course title.
     */
    public String getCourseTitle();

    /**
     * Calculates the total number of workload hours required for the 
     * course throughout a single semester.
     * @return An integer representing the total workload hours.
     */
    public int calculateTotalWorkload();

    /**
     * Retrieves the name of the instructor assigned to teach this course.
     * @return A string representing the instructor's name.
     */
    public String getInstructorName();

    /**
     * Displays all relevant information about the course to the console,
     * typically including the code, title, workload, and instructor.
     */
    public void printCourseDetails();
}
