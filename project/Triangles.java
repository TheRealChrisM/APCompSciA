public class Triangles{
    private int input;
    private char symbol='*';
    public Triangles(int enteredInput){
        input = enteredInput;
    }
    public void drawTriangle(){
        for(int x=1;x<=input;x++){
            for(int y=input-x;y>0;y--){
                System.out.print(" ");
            }
            for(int z=x;z>0;z--){
                System.out.print(symbol);
            }
            System.out.print("\n");
        }
    }
}