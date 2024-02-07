package Pattern;

public class DownTrianglePattern {
    public static void main(String[] args) {
        int n=8;
        for (int i=n; i>=1; i--){
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++){
                if (k==1 || i==n || k==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
