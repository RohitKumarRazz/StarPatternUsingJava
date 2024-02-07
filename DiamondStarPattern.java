package Pattern;

public class DiamondStarPattern {
    public static void main(String[] args) {
//        int n = 9;
//        for (int i=1; i<=n; i++){
//            for (int j=n; j>i; j--){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int k=1; k<2*(i-1); k++){
//                System.out.print(" ");
//
//            }
//            if (i==1){
//                System.out.print("");
//            }
//            else {
//                System.out.print("*");
//            }
//
//        }
//        for (int i=n-1; i>=1; i--){
//            for (int j=n; j>i; j--){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int k=1; k<=2*(i-1); k++){
//                System.out.print(" ");
//
//            }
//            if (i==1){
//                System.out.print("");
//            }
//            else {
//                System.out.print("*");
//            }}
        int rows=9,i,j,k;

        for (i=1; i<= rows ; i++)
        {
            for (j = rows; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if( i==1)
            {
                System.out.println("");
            }
            else
            {
                System.out.println("*");
            }
        }
        for (i=rows-1; i>= 1 ; i--)
        {
            for ( j = rows; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for ( k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if(i==1)
                System.out.println("");
            else
                System.out.println("*");
        }


    }
}
