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
        
        
        for(int x = 0;x<dieRoll.length-1;x++){
            int currentNum = dieRoll[x].getFaceValue();
            int nextNum = dieRoll[x+1].getFaceValue();
             if(currentNum==nextNum){
                inRun=true;
                System.out.print("(" + currentNum + " ");
                goRun(x);
                
            }
            else{
                System.out.print(currentNum + " ");
            }
        }
    }
    
    private void goRun(int num){    
        int x=num;
        int nextNum=x+1;
        while(inRun==true&&nextNum<dieRoll.length){
            if(dieRoll[x].getFaceValue()==dieRoll[nextNum].getFaceValue()){
                System.out.print(dieRoll[nextNum].getFaceValue()+ " ");
            }
            else{
                inRun=false;
                System.out.print(") ");
                System.out.print(dieRoll[nextNum].getFaceValue() + " ");
            }
             x++;
             nextNum++;
         }
    }
    public void longestRunTest(){
        for(int x = 0;x<dieRoll.length-1;x++){
            int currentNum = dieRoll[x].getFaceValue();
            int nextNum = dieRoll[x+1].getFaceValue();
             if(currentNum==nextNum){
                inRun=true;
                System.out.print("(" + currentNum + " ");
                longestRun(x);
            }
            else{
                System.out.print(currentNum + " ");
            }
        }
        System.out.println(currentLongRoll+" "+longRollStart+" "+longRollEnd);
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
                System.out.print(") ");
                System.out.print(dieRoll[nextNum].getFaceValue() + " ");
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
}


