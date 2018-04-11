
/**
 * Write a description of class RouteCipher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RouteCipher
{
    private String[][] letterBlock;
    private int numRows;
    private int numCols;
    
    public RouteCipher(int row, int col){
        numRows = row;
        numCols = col;
        letterBlock = new String[numRows][numCols];
    }
    
    private void fillBlock(String str){
        while(str.length()<(numRows*numCols)){
            str+="A";
        }
        int count = 0;
        for(int i=0; i<letterBlock.length;i++){
            for(int e=0; e<letterBlock[i].length;e++){
                letterBlock[i][e] = str.substring(count, count+1);
                count++;
            }
        }
    }
    
    private String encryptBlock(){
        String rs = "";
        for(int i=0; i<letterBlock[0].length;i++){
            for(int e=0; e<letterBlock.length;e++){
                rs+=letterBlock[e][i];
            }
        }
        return rs;
    }
    
    public String encryptMessage(String message){
        String rss = "";
        for(int i = 0; i<message.length(); i+=numRows*numCols){
            fillBlock(message.substring(i,i+numRows*numCols));
            rss+=encryptBlock();
        }
        return rss;
    }
}
