
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String fName;
    private String lName;
    private double GPA;
    private int grade;
    private int sID;
    public Student(String first, String last, double grade, int gradeLevel, int id){
        fName = first;
        lName = last;
        GPA = grade;
        grade = gradeLevel;
        sID = id;
    }
    //true for first, false for last
    public String getName(boolean fOrL){
        if(fOrL){
            return fName;
        }
        else{
            return lName;
        }
    }
    public double getGPA(){
        return GPA;
    }
    public int getGrade(){
        return grade;
    }
    public int getSID(){
        return sID;
    }
}
