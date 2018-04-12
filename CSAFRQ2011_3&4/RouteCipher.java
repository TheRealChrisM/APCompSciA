
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
        for(int l=0; l<letterBlock[0].length;l++){
            for(int e=0; e<letterBlock.length;e++){
                rs+=letterBlock[e][l];
            }
        }
        return rs;
    }
    
    public String encryptMessage(String message){
        String rss = "";
        String messageIn = message;
        while(!(messageIn.length()%(numRows*numCols)==0)){
            messageIn+="A";
        }
        for(int i = 0; i<messageIn.length(); i+=numRows*numCols){
            fillBlock(messageIn.substring(i,i+numRows*numCols));
            rss+=encryptBlock();
        }
        return rss;
    }
}
