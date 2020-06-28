//Uzrakstiet metodi, kas parada zinojumu: [datuma laiks] lekcija par kursu [kurss]

import java.util.Date;

public class Course {
    public static void main(String[] args) {

        CourseDetails detailsDate = new CourseDetails();
        String date = detailsDate.getDate (2020, 12,16);
        System.out.println(date);


        CourseDetails detailsTime = new CourseDetails();
        String time = detailsTime.getTime(12.15);
        System.out.println(time);

        CourseDetails detailsLesson = new CourseDetails();
        String lesson = detailsLesson.getCourse("Programming in Java");
        System.out.println(lesson);
    }

}


