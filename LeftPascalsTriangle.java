package Pattern;

public class LeftPascalsTriangle {
    public static void main(String[] args) {
        int n=7;
        for (int i=1; i<=n; i++){
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=n; i>=1; i--){
            for (int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for (int k=1; k<i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}