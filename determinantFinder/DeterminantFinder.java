 

public class DeterminantFinder
{
    /**
     * Determines if the determinant is defined for matrix.
     * @return true if the determinant is defined, false otherwise.
     */
    public static boolean determinantDefined(int[][] matrix)
    {
        return true;
    }

    /**
     * Calculates the determinant of matrix, which must be a 2x2 matrix.
     * (Precondition: matrix.length == 2 && matrix[0].length == 2)
     * @return the determinant.
     * @throws IllegalArgumentException if the precondition is not met.
     */
    public static int findTwoByTwoDeterminant(int[][] matrix)
    {
        return -1;
    }

    /**
     * Calculates a matrix identical to matrix with the specific row and column removed.
     * (Precondition: rowToRemove >= 0 && colToRemove >= 0 && matrix.length >
     *   rowToRemove && matrix[0].length > colToRemove)
     * @return matrix identical to matrix without the specified row and column.
     * @throws IllegalArgumentException if the precondition is not met.
     */
    public static int[][] removeRowAndColumn(int[][] matrix, int rowToRemove, int colToRemove)
    {
        int[][] newMatrix = new int[matrix.length-1][matrix[0].length-1];
        int curRowPos = 0;
        int curColPos = 0;
        for(int x = 0; curRowPos<newMatrix.length;x++){
            if(x!=rowToRemove){
                for(int y = 0; curColPos<newMatrix[0].length;y++){
                    if(y!=colToRemove){
                        newMatrix[curRowPos][curColPos] = matrix[x][y];
                        curColPos++;
                    }
                }
                curRowPos++;
                curColPos=0;
            }
        }
        return newMatrix;
    }

    /**
     * Calculates the determinant of matrix.
     * (Precondition: determinantDefined(matrix) returns true.)
     * @return the determinant.
     * @throws IllegalArgumentException if the precondition is not met.
     */
    public static int findDeterminant(int[][] matrix)
    {
        return -1;
    }

    private static boolean atLeastOneByOne(int[][] matrix)
    {
        return matrix != null && matrix.length > 0 && matrix[0].length > 0;
    }
}