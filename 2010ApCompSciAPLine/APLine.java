public class APLine{
    double APLNA;
    double APLNB;
    double APLNC;
    
    public APLine(int a, int b, int c){
        APLNA = a;
        APLNB = b;
        APLNC = c;
    }
    
    public double getSlope(){
        double slope = ((-APLNA)/APLNB);
        
        return slope;
    }
    
    public boolean isOnLine(int x, int y){
        boolean onLine;
        double xa = APLNA*x;
        double yb = APLNB*y;
        double xayb = xa+yb;
        double onLineTester = xayb + APLNC;
        if (onLineTester == 0){
            onLine = true;
        }
        else{
            onLine = false;
        }
        
        return onLine;
    }
}