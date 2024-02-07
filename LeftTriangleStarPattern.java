package Pattern;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
//        int n = 6;
//        for (int i=0; i<n; i++){
//            for (int j=2*(n-i); j>=0; j--){
//                System.out.print(" ");
//            }
//            for (int j=0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
        //row denotes the number of rows you want to print
        int i, j, row = 6;
//Outer loop work for rows
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=2*(row-i); j>=0; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
