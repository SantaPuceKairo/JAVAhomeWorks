//Create a method that returns [date time] lecture about course [course]

public class CourseInfo {

    public String getDate(int i, int i1, int i2) {
        return "Course date: " + i2+"/"+i1+"/"+i;
    }

    public String getTime(double time) {
        return "Course time: " + time;
    }

    public String getCourse(String courseName) {
        return "Lesson about course: " + courseName;
    }

}
