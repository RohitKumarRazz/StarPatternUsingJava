package Pattern;

public class RightPascalsTriangle {
    public static void main(String[] args) {
        int n=7;
        for (int i=0; i<=n-1; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        for (int i=n-1; i>=0; i--){
            for (int j=0; j<=i-1; j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}
