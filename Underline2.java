import java.util.Scanner;

public class Underline2 {

    public static void printUn(int lon){
        for(int i = 0; i < lon; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String text = sc.next();
            int lon = sc.nextInt();
            System.out.println(text);
            printUn(lon);
        }
    }
}
