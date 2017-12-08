
/**
 * Write a description of class CalculatorTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorTester
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        
        System.out.println("Math problem: \t\t" + "( 5 - 7 ) * ( 2 + 8 )");
        System.out.println("Postfix expression: \t" + calc.toPostFix("( 5 - 7 ) * ( 2 + 8 )"));
        System.out.println("Expected: \t\t5 7 - 2 8 + *");
        System.out.println("Postfix evaluation: \t" + calc.evaluate(calc.toPostFix("( 5 - 7 ) * ( 2 + 8 )")));
        System.out.println("Expected: \t\t-20\n"); 
        
        System.out.println("Math problem: \t\t" + "5 * 7 ^ 2 + ( 3 * 7 ) ^ 2");
        System.out.println("Postfix expression: \t" + calc.toPostFix("5 * 7 ^ 2 + ( 3 * 7 ) ^ 2"));
        System.out.println("Expected: \t\t5 7 2 ^ * 3 7 * 2 ^ +");
        System.out.println("Postfix evaluation: \t" + calc.evaluate(calc.toPostFix("5 * 7 ^ 2 + ( 3 * 7 ) ^ 2")));
        System.out.println("Expected: \t\t686\n"); 

        System.out.println("Math problem: \t\t" + "7 * ( ( 2 + 3 ) * ( 4 - 5 ) + 6 ^ ( 8 / 4 ) )");
        System.out.println("Postfix expression: \t" + calc.toPostFix("7 * ( ( 2 + 3 ) * ( 4 - 5 ) + 6 ^ ( 8 / 4 ) )"));
        System.out.println("Expected: \t\t7 2 3 + 4 5 - * 6 8 4 / ^ + *");
        System.out.println("Postfix evaluation: \t" + calc.evaluate(calc.toPostFix("7 * ( ( 2 + 3 ) * ( 4 - 5 ) + 6 ^ ( 8 / 4 ) )")));
        System.out.println("Expected: \t\t217\n"); 
        
    }
}

