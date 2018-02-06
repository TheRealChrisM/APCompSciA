
/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom
{
    private Student[] roster;
    private String location;
    private String teacher;
    
    public Classroom(String loc, String teach){
        location = loc;
        teacher = teach;
        roster = new Student[29];
    }
    public String getLocation(){
        return location;
    }
    public String getTeacher(){
        return teacher;
    }
    public void getStudents(){
        System.out.println("Students for " + teacher + "'s class");
        for(int x = 0; x<roster.length; x++){
            System.out.println(x + ") " + roster[x]);
        }
    }
    public void addStudent(){
        
    }
    public void removeStudent(int arrLoc){
        
    }
}
