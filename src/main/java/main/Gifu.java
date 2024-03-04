package main;

import java.util.ArrayList;

public class Gifu {
    String university;

    public Gifu (){

        
    }

    public void addUniName(String nam){
        university=nam;
    }
    ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(String x,String y){
        courses.add(new Course(x,y));
    }
    public void listCourses(){
        int index=0;
        String toimipls="miksi";
        for(Course c : courses)
            toimipls=c.tellInfo();
            System.out.println(toimipls);
            System.out.println((index++)+") "+toimipls);
    }


}




