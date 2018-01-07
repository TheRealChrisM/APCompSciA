
/**
 * Write a description of class PalindromeChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PalindromeChecker
{
    private String input;
    private String[][] palindrome;
    
    //Sets the input string equal to the possible palindrome
    public PalindromeChecker(String strIn){
        input = formatString(strIn);
        palindrome = new String[2][input.length()];
    }
    
    //checks the palindrome and outputs a true or false
    public boolean checkPalindrome(){
        boolean rs=false;
        for(int x=1; x<=input.length(); x++){
            palindrome[0][x-1] = input.substring(x-1,x);
            palindrome[1][input.length()-x] = input.substring(x-1,x);
        }
        
        for(int x=1; x<=input.length(); x++){
            System.out.println(0+")"+palindrome[0][x-1]);
            System.out.println(1+")"+palindrome[1][x-1]);
        }
        for(int y=0; y<input.length();y++){
            if(palindrome[0][y].equals(palindrome[1][y])){
                rs=true;
            }
            else{
                return false;
            }
        }
        
        return rs;
    }
    
    //replaces the input string using only characters a-z&0-9
    public String formatString(String str){
        String tmpStr = "";
        String strlc = str.toLowerCase();
        for(int x = 1; x<=str.length(); x++){
            String chr = strlc.substring(x-1,x);
            
            switch(chr){
                case "a": tmpStr+="a"; break;
                case "b": tmpStr+="b"; break;
                case "c": tmpStr+="c"; break;
                case "d": tmpStr+="d"; break;
                case "e": tmpStr+="e"; break;
                case "f": tmpStr+="f"; break;
                case "g": tmpStr+="g"; break;
                case "h": tmpStr+="h"; break;
                case "i": tmpStr+="i"; break;
                case "j": tmpStr+="j"; break;
                case "k": tmpStr+="k"; break;
                case "l": tmpStr+="l"; break;
                case "m": tmpStr+="m"; break;
                case "n": tmpStr+="n"; break;
                case "o": tmpStr+="o"; break;
                case "p": tmpStr+="p"; break;
                case "q": tmpStr+="q"; break;
                case "r": tmpStr+="r"; break;
                case "s": tmpStr+="s"; break;
                case "t": tmpStr+="t"; break;
                case "u": tmpStr+="u"; break;
                case "v": tmpStr+="v"; break;
                case "w": tmpStr+="w"; break;
                case "x": tmpStr+="x"; break;
                case "y": tmpStr+="y"; break;
                case "z": tmpStr+="z"; break;
                case "1": tmpStr+="1"; break;
                case "2": tmpStr+="2"; break;
                case "3": tmpStr+="3"; break;
                case "4": tmpStr+="4"; break;
                case "5": tmpStr+="5"; break;
                case "6": tmpStr+="6"; break;
                case "7": tmpStr+="7"; break;
                case "8": tmpStr+="8"; break;
                case "9": tmpStr+="9"; break;
                case "0": tmpStr+="0"; break;
            }
        }
        System.out.println(tmpStr);
        return tmpStr;
    }
}
