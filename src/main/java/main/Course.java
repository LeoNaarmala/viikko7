package main;

public class Course {
    String name;
    String id;
    int maxNumberOfStudents;
    public String infoz;
    public Course(String k, String l){
        name=k;
        id=l;
        infoz=l+" "+k;
    }
    public String tellInfo() {
        return infoz;

        
    }



    
    }

    



