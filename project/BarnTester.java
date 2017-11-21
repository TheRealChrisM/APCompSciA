public class BarnTester{
    public static void main(String[] args){
        HorseBarn barn = new HorseBarn();
        
        barn.placeHorse(new Horse("a", 100), 1);
        barn.placeHorse(new Horse("b", 100), 2);
        barn.placeHorse(new Horse("c", 100), 4);
        barn.placeHorse(new Horse("d", 100), 7);
        barn.placeHorse(new Horse("e", 100), 10);
        
        
        System.out.println("Horse a is in stall " + barn.findHorseSpace("a"));
        System.out.println("Horse b is in stall " + barn.findHorseSpace("b"));
        System.out.println("Horse c is in stall " + barn.findHorseSpace("c"));
        System.out.println("Horse d is in stall " + barn.findHorseSpace("d"));
        System.out.println("Horse e is in stall " + barn.findHorseSpace("e"));
        System.out.println("Horse f is in stall " + barn.findHorseSpace("f"));        

        barn.consolodate();

        System.out.println("Horse a is in stall " + barn.findHorseSpace("a"));
        System.out.println("Horse b is in stall " + barn.findHorseSpace("b"));
        System.out.println("Horse c is in stall " + barn.findHorseSpace("c"));
        System.out.println("Horse d is in stall " + barn.findHorseSpace("d"));
        System.out.println("Horse e is in stall " + barn.findHorseSpace("e"));
        System.out.println("Horse f is in stall " + barn.findHorseSpace("f"));
    }
}