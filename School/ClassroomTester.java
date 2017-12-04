
/**
 * Write a description of class ClassroomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassroomTester
{
    public static void main(String[] args){
        Classroom cRoom = new Classroom();
        
        Student john = new Student("John", "Doe", 1);
        Student jane = new Student("Jane", "Doe", 2);
        Student mr = new Student("Mr.", "Friedman", 18);
        
        cRoom.addStudent(john);
        cRoom.addStudent(jane);
        cRoom.addStudent(mr);
    
        System.out.println(cRoom + "\n \n" + cRoom.getSize());
        System.out.println(cRoom.getAStudents());
    }
}
