public class SuperFunTimeGame{
    private final int STARTING_KASH=100;
    private int totalPlays;
    private int currentKash;
    public SuperFunTimeGame(){
        totalPlays = 0;
        currentKash=STARTING_KASH;
    }
    public void playGame(){
        while((currentKash>0)&&(currentKash<STARTING_KASH*2)){
            if(diceRoll()){
                currentKash = currentKash+5;
                System.out.println("Current Money: " + currentKash);
            }
            else{
                currentKash=currentKash-1;
                System.out.println("Current money: " + currentKash);
            }
            totalPlays++;
        }
    }
    public boolean diceRoll(){
        boolean sameSides;
        Die d1 = new Die();
        Die d2 = new Die();
        System.out.println("Round #; " + totalPlays);
        d1.roll();
        d2.roll();
        int d1Roll = d1.getFaceValue();
        int d2Roll = d2.getFaceValue();
        
        if(d1Roll==d2Roll){
            sameSides=true;
        }
        else{
            sameSides=false;
        }
        System.out.println("dice 1 = " + d1Roll + " dice 2 = " + d2Roll);
        System.out.println("Same side? " + sameSides);
        return sameSides;
    }
}