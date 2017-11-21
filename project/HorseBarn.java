public class HorseBarn{

    private int[] horses = new int[2];
    private final int STABLE_SIZE = 10;
    private Horse[] spaces;
    private int filledTo=0;
    public HorseBarn(){
        spaces = new Horse[STABLE_SIZE];
    }
    public int findHorseSpace(String name){
        for(int x=0;STABLE_SIZE-1>=x;x++){
            if(spaces[x]!=null && spaces[x].getName().equals(name)){
                return x+1;
            }
        }
        return -1;
    }
    /**public void consolodate(){
        for(int x=0;x<=STABLE_SIZE-1;x++){
            checkEmptySpaces(x);
            if(x!=horses[1]){
                spaces[x]=spaces[horses[0]];
            }
        }
    }
    private void checkEmptySpaces(int y){
        if(y==0){
            horses[0]=y;
            checkEmptySpaces(y+1);
        }
        else{
            horses[1]=y;
        }
    }**/
    public void consolodate(){
        for(int x=0;x<=STABLE_SIZE-1;x++){
            if(spaces[x] == null){
                System.out.println("Space " + x + " is Empty space");
                int nextHorse = nextTakenSpace(x);
                if(nextHorse > 0)
                {
                    spaces[x] = spaces[nextHorse];
                    spaces[nextHorse] = null;
                }
                System.out.println("Moving horse to space");
            }
            
        }
    }
    public int nextTakenSpace(int z){
        System.out.println("test");
        for(int i=z;i<=STABLE_SIZE-1;i++){
            if(spaces[i] != null){
                //filledTo=x;  
                return i;
            }
        }
        return -1;
    }
    public void placeHorse(Horse x, int position){
        if(position-1 >= STABLE_SIZE||position<0){
            System.out.println("That spot does not exist.");
        }
        else if(spaces[position-1] != null){
            System.out.println("That spot is taken.");
        }
        else{
            spaces[position-1] = x;
        }
    }
}
