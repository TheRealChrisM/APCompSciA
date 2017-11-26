public class DiceRun{
    private boolean inRun=false;
    private final int DICE_ROLLZ=20;
    private Die[] dieRoll;
    private int longRollStart;
    private int longRollEnd;
    private int currentLongRoll;
    
    public DiceRun(){
         dieRoll = new Die[DICE_ROLLZ]; 
         for(int z = 0;z<DICE_ROLLZ;z++){
            dieRoll[z] = new Die();
        }
        for(int i = 0;i<DICE_ROLLZ;i++){
            dieRoll[i].roll();

        }
    }
    
    public void startRun(){
        
        //System.out.print("\n");
        for(int x = 0;x<dieRoll.length-1;x++){
            int currentNum = dieRoll[x].getFaceValue();
            int nextNum = dieRoll[x+1].getFaceValue();
             if(currentNum==nextNum){
                inRun=true;
                System.out.print("( " + currentNum + " ");
                x=goRun(x)-2;
                
            }
            else{
                System.out.print(currentNum + " ");
            }
        }
        if(dieRoll[19].getFaceValue()!=dieRoll[18].getFaceValue()){
                System.out.print(dieRoll[19].getFaceValue());
            }
    }
    
    private int goRun(int num){    
        int z=num;
        int nextNum=z+1;
        while(inRun==true&&nextNum<dieRoll.length){
            if(dieRoll[z].getFaceValue()==dieRoll[nextNum].getFaceValue()){
                System.out.print(dieRoll[nextNum].getFaceValue()+ " ");
            }
            else{
                inRun=false;
            }
             z++;
             nextNum++;
         }
        System.out.print(") ");
        //if(nextNum<dieRoll.length&&inRun==false){
        //    System.out.print(dieRoll[nextNum].getFaceValue() + " ");
        //}
        return nextNum;
    }
    public void longestRunTest(){
        System.out.print("\n");
        for(int x = 0;x<dieRoll.length-1;x++){
            int currentNum = dieRoll[x].getFaceValue();
            int nextNum = dieRoll[x+1].getFaceValue();
            if(currentNum==nextNum){
                inRun=true;
                longestRun(x);
            }
        }
        for(int y=0;y<=longRollStart-1;y++){
            System.out.print(dieRoll[y].getFaceValue() + " ");
        }
        System.out.print("( ");
        for(int z=longRollStart;z<=longRollEnd-1;z++){
            System.out.print(dieRoll[z].getFaceValue() + " ");
        }
        System.out.print(") ");
        for(int i=longRollEnd;i<dieRoll.length;i++){
            System.out.print(dieRoll[i].getFaceValue() + " ");
        }
        System.out.println("\nLongest Run: "+currentLongRoll+"\nRun Start @: "+longRollStart+"\nRun End @: "+longRollEnd);
    }
    private void longestRun(int num){
       int x=num;
       int xStart=num;
       int nextNum=x+1;
       
       int length=0;
       while(inRun==true&&nextNum<dieRoll.length){
            if(dieRoll[x].getFaceValue()==dieRoll[nextNum].getFaceValue()){
            }
            else{
                inRun=false;
                }
            x++;
            nextNum++;
            length++;
       }
       int endsAt=x;
       if(length>currentLongRoll){
           currentLongRoll = length;
           longRollStart = xStart;
           longRollEnd = endsAt;
       }
       
    }
    
    public void callBoth(){
        System.out.println("\u000c");
        longestRunTest();
        startRun();
    }
}


