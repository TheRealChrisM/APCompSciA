import java.util.Scanner;
/**
 * Write a description of class Interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interface
{
    private static Classroom mainClass;
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the LAST NAME for the teacher of this class? (Do not use a prefix or spaces!)");
        String lead = input.next();
        System.out.println("Where is this class located?");
        String room = input.next();
        System.out.println("Creating class with Teacher " + lead + " in room " + room + " Please Wait!");
        mainClass = new Classroom(room, lead);
        gotoMenu();
        
    }
    public static void gotoMenu(){
        Scanner menu = new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("Welcome to " + mainClass.getTeacher() + "'s Classroom! What would you like to do next?");  
        System.out.println(" 1. List Students \n 2. Sort Students \n 3. Add/Remove Students \n 4. Promote Students \n 0. Exit");
        switch(menu.nextInt()){
            case 0: System.exit(0);
            case 1: mainClass.getStudents();
            case 2: 
            case 3: manipulateStudents();
            case 4:
            case 5:
        }
    }
    public static void manipulateStudents(){
        Scanner students = new Scanner(System.in);
        System.out.println("Press 1 to add a student. Press 2 to remove a student.");
        int option = students.nextInt();
        if(option == 1){
            
        }
        else if(option == 2){
            System.out.println("Which student would you like to remove?");
            mainClass.getStudents();
            mainClass.removeStudent(students.nextInt());
        }
        else{
            System.out.println("ERROR");
            gotoMenu();
        }
    }
}
